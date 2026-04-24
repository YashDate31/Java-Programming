import java.util.Scanner;

class Rectangle
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


   public static void main(String []a)
   { 
 
    Rectangle r1=new Rectangle();
    r1.getdata();
    r1.area();

   }
}
 