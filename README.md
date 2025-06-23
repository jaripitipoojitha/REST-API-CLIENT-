# REST-API-CLIENT-

*COMPANY* : CODETECH IT SOLUTIONS

*NAME* : JARIPITI POOJITHA

*INTERN ID* : CT04DF549

*DURATION* : 4-WEEKS

*MENTOR* : NEELA SANTOSH

*DESCRIPTION* :

The provided Java program is a simple yet functional weather application that fetches and displays real-time weather information for a specified city using the OpenWeatherMap API. This program begins by importing several essential Java libraries such as java.io.BufferedReader, java.io.InputStreamReader, java.net.HttpURLConnection, java.net.URL, org.json.JSONObject, and java.util.Scanner. These imports help handle tasks like reading input from the user, establishing HTTP connections, reading responses from a web server, and parsing JSON data. The main class WeatherApp contains the core logic within the main method, which serves as the entry point for the application.

Initially, the program prompts the user to input the name of the city for which they want to retrieve weather data. It utilizes the Scanner class to read this input from the console. After receiving the city name, the scanner is closed to prevent resource leakage. The program then constructs an API URL using the city name and a placeholder API key (your_api_key), which must be replaced by the user with their valid OpenWeatherMap API key. The URL is designed to request weather data in metric units, which returns temperature in degrees Celsius.

Using this constructed URL, the program creates a HttpURLConnection object and sets the request method to "GET", indicating it wants to retrieve data. The server's response is read line by line using a BufferedReader wrapped around an InputStreamReader, and each line is appended to a StringBuilder to form the complete JSON response string. This JSON string is then parsed using the org.json.JSONObject class to extract relevant weather details.

The JSON response contains nested objects and arrays. The program accesses the "sys" object to retrieve the "country" code and the "weather" array to get both the general weather condition (like "Clear", "Rain", etc.) and a more detailed description (like "clear sky", "light rain"). Additionally, the program reads the "main" object to fetch the current temperature. After extracting these values, it neatly displays them to the user

*OUTPUT* :

Enter city name: Delhi

--- Weather Report ---

City: Delhi

Country: IN

Temperature: 38.2 °C

Weather: Clear

Description: clear sky 


