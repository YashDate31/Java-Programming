import java.net.*;
import java.io.*;
public class server {
    public static void main(String ad[])
    {
        try{
        ServerSocket ss = new ServerSocket(500);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String a = dis.readUTF();
        System.out.println(a);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
}
/*

            Socket s = ss.accept(); // accept client

            DataInputStream dis = new DataInputStream(s.getInputStream());
            String msg = dis.readUTF();

            System.out.println("Client says: " + msg);

            ss.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
} */