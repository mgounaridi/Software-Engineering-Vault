# Real Estate Web Scraper & Telegram Bot

An automated Python script built to monitor a highly competitive real estate market. It scrapes live property listings, tracks historical data to prevent duplicate alerts, and pushes instant notifications to a mobile device via the Telegram API.

**Core Technologies & Concepts**
* **Headless Web Scraping:** Utilized `Playwright` to launch a headless Chromium browser, wait for asynchronous page elements to render, and extract specific DOM elements (titles, prices, links) using CSS selectors.
* **Relational Databases (SQLite3):** Integrated a lightweight local database to persist application state. Used SQL `INSERT` and `SELECT` queries to track previously processed `house_id` records and prevent redundant notifications.
* **REST APIs:** Implemented the `requests` library to format and dispatch JSON payloads to the Telegram Bot API, converting scraped data into real-time mobile push notifications.
* **Error Handling:** Designed fault-tolerant scraping logic with `try-except` blocks to ensure the bot continues processing the queue even if a single DOM element fails to load.
