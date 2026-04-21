package Manual.Unit_4_Networking.Pr23_InetAddress;

import java.net.InetAddress;

public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("Host Name: " + local.getHostName());
            System.out.println("IP Address: " + local.getHostAddress());
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
