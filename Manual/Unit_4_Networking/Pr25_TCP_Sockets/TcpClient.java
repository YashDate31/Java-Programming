package Manual.Unit_4_Networking.Pr25_TCP_Sockets;

import java.io.DataOutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            output.writeUTF("Hello from TCP client");
            output.flush();
            System.out.println("Message sent to server");
        } catch (Exception ex) {
            System.out.println("Client error: " + ex.getMessage());
        }
    }
}
