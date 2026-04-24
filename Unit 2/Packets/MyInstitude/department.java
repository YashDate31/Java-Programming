package packets.MyInstitude;

import java.util.*;

public class department {
    String staff;

    public void accept()
    {
        System.out.println("Enter the Staff Name: ");
        Scanner sc = new Scanner(System.in);
        staff = sc.next();

    }
    
    public void display()
    {
        System.out.println("Staff :="+staff);
    }

}


