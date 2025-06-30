import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class WeatherApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String API_KEY = "ad99371c66ad64b9207a3b76fd3b23c5";

        System.out.print("Enter city name: ");
        String city = scanner.nextLine();

        try {
            // Build the URL for API call
            String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" 
                + city + "&units=metric&appid=" + API_KEY;

            // Make HTTP GET request
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Read response
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Parse JSON
            JSONObject obj = new JSONObject(response.toString());
            JSONObject main = obj.getJSONObject("main");
            JSONObject weather = obj.getJSONArray("weather").getJSONObject(0);

            // Display data
            System.out.println("\nWeather in " + city + ":");
            System.out.println("Temperature: " + main.getDouble("temp") + " °C");
            System.out.println("Humidity: " + main.getInt("humidity") + "%");
            System.out.println("Description: " + weather.getString("description"));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
