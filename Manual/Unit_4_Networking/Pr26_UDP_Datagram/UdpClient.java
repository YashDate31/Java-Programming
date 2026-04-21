package Manual.Unit_4_Networking.Pr26_UDP_Datagram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket()) {
            String message = "Hello from UDP client";
            byte[] data = message.getBytes();

            InetAddress ip = InetAddress.getByName("localhost");
            DatagramPacket packet = new DatagramPacket(data, data.length, ip, 6000);
            socket.send(packet);

            System.out.println("UDP message sent");
        } catch (Exception ex) {
            System.out.println("UDP client error: " + ex.getMessage());
        }
    }
}
