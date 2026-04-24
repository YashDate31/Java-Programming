import java.io.*;
import java.net.*;
public class client {
    public static void main(String args[])
    {
        try{
            Socket s = new Socket("localhost",500);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello");
            s.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
}
