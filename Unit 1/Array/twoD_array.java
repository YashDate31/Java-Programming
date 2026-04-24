import java.util.*;

public class twoD_array {
    public static void main(String args[])
    {
        int a[][]= new int[3][3];
        
        System.out.println("Enter the 3*3 array:");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter :=== "+i+" : "+j +" ");
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Elements are : ");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("\t"+a[i][j]);
            }
            System.out.println("");
        }
    }
}
