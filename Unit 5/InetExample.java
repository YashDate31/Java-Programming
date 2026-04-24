import java.net.*;

public class InetExample {
    public static void main(String[] args) {
        try {
            // Factory Methods
            InetAddress local = InetAddress.getLocalHost();
            InetAddress google = InetAddress.getByName("www.google.com");
            InetAddress[] youtube = InetAddress.getAllByName("www.youtube.com");
           System.out.print(youtube);

            // Instance Methods
            System.out.println("Local Host Name: " + local.getHostName());
            System.out.println("Local IP Address: " + local.getHostAddress());

            System.out.println("Google Host Name: " + google.getHostName());
          System.out.println("Google IP Address: " + google.getHostAddress());
          System.out.println("get all by name:"+ google.getAddress());

            // Using toString()
            System.out.println("Local (toString): " + local.toString());
           System.out.println("Google (toString): " + google.toString());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}