import java.util.*;
class base 
{
	String name;
	int roll_no;
	
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		name=sc.next();
		System.out.println("Enter roll_no:");
		roll_no=sc.nextInt();
	}
	
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Roll_no:"+roll_no);
	}
}

class derived extends base
{
	int m;
	void getdata1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks:");
		m=sc.nextInt();
	}

	void display1()   
	{
		System.out.println("marks:"+m);	}
}

class dis
{
	public static void main(String args[])
	{
		derived d=new derived();
		d.getdata();
		d.getdata1();
		d.display();
		d.display1();
	} 
}