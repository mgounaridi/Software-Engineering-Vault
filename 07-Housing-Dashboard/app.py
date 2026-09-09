from flask import Flask, render_template
import sqlite3
import pandas as pd

app = Flask(__name__)

@app.route('/')
def dashboard():
    try:
        conn = sqlite3.connect('amsterdam_houses.db')
        df = pd.read_sql_query("SELECT house_id FROM seen_houses", conn)
        conn.close()
    except Exception:
        # Fallback if the database is empty or missing     
        df = pd.DataFrame(columns=['house_id'])

    total_scraped = len(df)
    houses = df.to_dict(orient='records')

    return render_template('index.html', total=total_scraped, houses=houses)

if __name__ == '__main__':
    app.run(debug=True)
