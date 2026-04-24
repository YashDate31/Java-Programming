import java.util.*;

public class switch1 {
    public static void main(String args[])
    {
        char ch;
        Scanner sc = new Scanner(System.in);

        

        System.out.println("Enter a alphabate: ");
        
        ch = sc.next().charAt(0);

        switch(ch)
        {
            case 'A':
                System.out.println("it is the vowel: ");
                break;

            default:
                System.out.println("It is the consonant..");

        }



    }
    
}
