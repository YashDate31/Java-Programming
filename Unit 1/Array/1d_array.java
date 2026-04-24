import java.util.*;
class 1d_array {
    public static void main(String args[])
    {
        int a[] = new int[10];

        for(int i= 0;i<5;i++)
        {
            Scanner sc = new Scanner(System.in);
            a[i]= sc.nextInt();

        }

        System.out.println("Array is :  ");

        for(int i= 0;i<5;i++)
        {
          System.out.println(a[i]);
        }



    }
    
}
