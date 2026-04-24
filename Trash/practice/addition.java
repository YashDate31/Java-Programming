import java.util.*;

public class addition {
    public static void main(String[] args) {
        addition1 a1 = new addition1();
        a1.getdata();
        
    }
    
}
class addition1
{
    int a,b;

    void getdata()
    {
    System.out.println("Enter the two numbers");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b= sc.nextInt();

    int c = a+b;
    System.err.println("sum ="+ c);
    }



}
