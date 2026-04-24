import java.net.*;
import java.io.*;

public class URLConnectionExample {
    public static void main(String[] args) {
        try {
            // Create URL
            URL url = new URL("http://www.google.com");
            URL url2 = new URL( "http", "Yash","URLExample.java");
            URL url3 = new URL( "http", "Yash",2,"URLExample.java");

            URLConnection connn = url2.openConnection();
            System.out.println("Timepass:-"+connn.getContentLength());


            URLConnection con = url.openConnection();

            // Display information
            System.out.println("URL: " + con.getURL());
            System.out.println("Content Type: " + con.getContentType());
            System.out.println("Content Length: " + con.getContentLength());
            System.out.println("Encoding: " + con.getContentEncoding());
            System.out.println("Date: " + con.getDate());
            System.out.println("Last Modified: " + con.getLastModified());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}