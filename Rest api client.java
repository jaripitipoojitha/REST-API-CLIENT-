import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import java.util.Scanner;

public class WeatherApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter city name: ");
        String city = scanner.nextLine();
        scanner.close();

        String apiKey = "your_api_key";  //  Replace with your OpenWeatherMap API key
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JSONObject json = new JSONObject(response.toString());

            String country = json.getJSONObject("sys").getString("country");
            String weather = json.getJSONArray("weather").getJSONObject(0).getString("main");
            String description = json.getJSONArray("weather").getJSONObject(0).getString("description");
            double temperature = json.getJSONObject("main").getDouble("temp");

            System.out.println("\n--- Weather Report ---");
            System.out.println("City: " + city);
            System.out.println("Country: " + country);
            System.out.println("Temperature: " + temperature + " °C");
            System.out.println("Weather: " + weather);
            System.out.println("Description: " + description);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
