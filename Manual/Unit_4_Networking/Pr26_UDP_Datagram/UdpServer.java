package Manual.Unit_4_Networking.Pr26_UDP_Datagram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket(6000)) {
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            System.out.println("UDP server waiting on port 6000...");
            socket.receive(packet);

            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received: " + message);
        } catch (Exception ex) {
            System.out.println("UDP server error: " + ex.getMessage());
        }
    }
}
