import java.util.*;
class vowel
{
	public static void main(String args[])
	{
	char v;
	do{
	System.out.println("Enter the Alphabate");
	Scanner sc = new Scanner(System.in);
	v = sc.nextLine().charAt(0);
	
	switch(v)
	{
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		System.out.println("vowel");
		break;
	
	default:
	System.out.println("Consonanat");
	
	}
	}while(v==0);

}
}