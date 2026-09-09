import sqlite3
import requests
from playwright.sync_api import sync_playwright

# Replace with your actual Telegram bot token and chat ID before running locally
TOKEN = "YOUR_TELEGRAM_BOT_TOKEN_HERE"
CHAT_ID = "YOUR_TELEGRAM_CHAT_ID_HERE"
URL = "https://www.pararius.com/apartments/amsterdam?sort=date-down"

def send_alert(message):
    api_url = f"https://api.telegram.org/bot{TOKEN}/sendMessage"
    requests.post(api_url, json={"chat_id": CHAT_ID, "text": message})

def run_bot():
    conn = sqlite3.connect('amsterdam_houses.db')
    cursor = conn.cursor()
    cursor.execute('''CREATE TABLE IF NOT EXISTS seen_houses (house_id TEXT PRIMARY KEY)''')
    
    print("Opening browser to scrape Pararius...")
    with sync_playwright() as p:
        browser = p.chromium.launch(headless=True)
        page = browser.new_page()
        page.goto(URL, timeout=60000)
        page.wait_for_selector(".listing-search-item", timeout=30000)
        houses = page.query_selector_all(".listing-search-item")
        
        for house in houses[:5]:
            try:
                title_el = house.query_selector(".listing-search-item__link--title")
                price_el = house.query_selector(".listing-search-item__price")
                if not title_el or not price_el:
                    continue
                
                title = title_el.inner_text().strip()
                link = "https://www.pararius.com" + title_el.get_attribute("href")
                price = price_el.inner_text().strip()
                house_id = link.split("/")[-1]
                
                cursor.execute("SELECT house_id FROM seen_houses WHERE house_id = ?", (house_id,))
                
                if cursor.fetchone() is None:
                    msg = f"NEW AMSTERDAM RENTAL\n\n{title}\nPrice: {price}\nLink: {link}"
                    send_alert(msg)
                    cursor.execute("INSERT INTO seen_houses (house_id) VALUES (?)", (house_id,))
                    print(f"Sent alert for: {title}")
                else:
                    print(f"Already seen: {title}")
            except Exception:
                continue
        
        browser.close()
    
    conn.commit()
    conn.close()
    print("Scrape complete!")

if __name__ == '__main__':
    run_bot()
