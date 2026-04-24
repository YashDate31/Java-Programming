
import java.util.Scanner;

class employee
{
	int empid;
	int salary;
	String name;
	
	void accept()
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the employee Name:=");
			name = sc.next();
			System.out.println("Enter the employee ID:=");
			empid = sc.nextInt();
			System.out.println("Enter the employee Salary:=");
			salary = sc.nextInt();
			

		}
	void display()
		{
		 System.out.println("Name:-" + name);
		 System.out.println("ID:-" + empid);
		 System.out.println("Salary:-" + salary);

		}
}

class employeee
{
	public static void main(String args[])
	{
		 employee[] e = new employee[2];

		for(int i=0;i<2;i++)
		{
			       e[i] =new employee();

		}

		for(int i= 0; i<2;i++)
		{
			e[i].accept();
		}
		
			System.out.println("*************Details are***********");

		for(int i= 0; i<2;i++)
		{
			e[i].display();
		}

	}


}
	