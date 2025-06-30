# Task 2 - Java Weather API Client

## 🌦 Description
This is a simple Java console app that fetches current weather data for any city using the **OpenWeatherMap API**.

It uses `HttpURLConnection` to connect to the API and `org.json` to parse the JSON response.

---

## 📥 Requirements

- Java 8+
- `json-20240303.jar` (included in this repo)

---

## 🛠 How to Run

1. Open Terminal / VS Code
2. Compile:
````bash
javac -cp .;json-20240303.jar WeatherApp.java
````
3. Run:
````bash
java -cp .;json-20240303.jar WeatherApp
````
4. API Key Required
   You must create a free account on https://openweathermap.org/api and get an API key.

Then paste your key in the line: 
````
String API_KEY = "your_api_key_here";
````
---

## 💻Sample Output
````
Enter city name: Delhi
Weather in Delhi:
Temperature: 32.5 °C
Humidity: 48%
Description: clear sky
````
---

📁 Files Included :
-WeatherApp.java – Java code
-json-20240303.jar – JSON parsing library
-screenshot.png – Output preview 
-README.md – This file



   
