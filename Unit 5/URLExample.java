import java.net.*;

public class URLExample {
    public static void main(String[] args) {
        try {
            // Create URL object
            URL url = new URL("http","www.yash.com",800,"hello.java");

            // Display URL details
            System.out.println("Full URL: " + url.toString());
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Default Port: " + url.getDefaultPort());
            System.out.println("File: " + url.getFile());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}