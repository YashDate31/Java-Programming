import java.util.*;
public class password {
    public static void main(String[] args) {
        String user="admin";
        String pass = "Admin@123";
        String entered;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pass");
        entered = sc.next();
        try{
            if(user.equals("Admin")&& pass.equals(entered))
            {
                System.out.println("login successfull");
            }
            else
                throw new Exception("invalid");
            
        }
        catch(Exception e)
        {
            System.out.print(e);
        }


    }
    
}
