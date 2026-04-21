package Manual.Unit_4_Networking.Pr25_TCP_Sockets;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server started on port 5000");
            Socket socket = serverSocket.accept();

            DataInputStream input = new DataInputStream(socket.getInputStream());
            String message = input.readUTF();
            System.out.println("Received from client: " + message);

            socket.close();
        } catch (Exception ex) {
            System.out.println("Server error: " + ex.getMessage());
        }
    }
}
