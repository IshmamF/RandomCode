import datetime as dt
import requests
import os

from dotenv import load_dotenv
load_dotenv() 

API_KEY = os.getenv('API_KEY')
BASE_URL = "http://api.openweathermap.org/data/2.5/weather?"
CITY = 'London'

url = f"https://api.openweathermap.org/data/2.5/weather?q={CITY}&appid={API_KEY}"
response = requests.get(url).json()

print(response)
