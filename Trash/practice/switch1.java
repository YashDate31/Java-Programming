import java.util.*;
public class switch1 {
    public static void main(String[] args)

    {
        char ch;
        System.out.println("Enter a alphabate: ");
        Scanner sc = new Scanner(System.in);

        ch= sc.next().charAt(0);

        switch(ch)
        {
            case 'a':
            case 'e':
            case 'o':
            case 'i':
            case 'u':
                    System.out.println("It is an vowel......");

            default:
                System.out.println("it is a consonant...");

        }

    }
}
