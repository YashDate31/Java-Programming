import java.util.*;

class Rectdemo
{
     Scanner sc=new Scanner(System.in);
     int len;
     int bred;
     void getdata()
     {
       System.out.println("Enter the value of length");

       len= sc.nextInt();

       System.out.println("Enter the value of breadth");

       bred= sc.nextInt();
     }

     void area()
     {

      int arearec=len*bred;

      System.out.println("Area=" + arearec);
     
     }

}

   class Rectanglearea
  {
    public static void main(String []a)
    { 
 
     Rectdemo r1=new Rectdemo();
     r1.getdata();
     r1.area();

    }
  }
 