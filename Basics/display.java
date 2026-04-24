import java.util.Scanner;

public class display {
    static public void main(String[] args)
    {
        String  name;
        int roll_no;
        float percentage;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.nextLine();

        System.out.println("Enter roll no");
        roll_no = sc.nextInt();

        System.out.println("Enter percentage");
        percentage = sc.nextFloat();

        System.out.println(name);
        System.out.println(roll_no);
        System.out.println(percentage);
        
    }
}
