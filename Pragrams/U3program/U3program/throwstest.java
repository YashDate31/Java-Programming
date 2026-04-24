import java.io.*;

class throwstest
{
  public static void main(String a[]) throws IOException
  {
   String nm;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.print("Enter the your name:");
   nm=br.readLine();
   System.out.print("hello:"+nm);
  }
}