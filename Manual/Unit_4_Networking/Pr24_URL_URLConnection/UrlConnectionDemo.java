package Manual.Unit_4_Networking.Pr24_URL_URLConnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionDemo {
    public static void main(String[] args) {
        try {
            URL url = URI.create("https://example.com").toURL();
            URLConnection connection = url.openConnection();

            System.out.println("Content Type: " + connection.getContentType());
            System.out.println("Content Length: " + connection.getContentLength());

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            for (int i = 0; i < 5; i++) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
            reader.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
