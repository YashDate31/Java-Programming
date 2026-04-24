import java.util.*;

class Person
{
	int uid;
	String name;

	Person()
	{
		uid=(-1);
		name="XYZ";
	}
	Person(int id, String n)
	{
		uid=id;
		name=n;
	}
	void display()
	{
		System.out.println("id : "+uid);
		System.out.println("name : "+name);
	}
}

class Employee extends Person
{
	int eid;
	int salary;
	Employee()
	{
		eid=0;
		salary=0;
	}
	Employee(int uid, String n, int id, int sal)
	{
	        super(uid,n);
		eid=id;
		salary=sal;
	}
	
	
	void display()
	{
		System.out.println("eid : "+eid);
		System.out.println("salary : "+salary);
	}
}
public class TestEmployee
{
	public static void main(String[] args)
	{
		Employee e= new Employee();
		e.display();
		
		Employee e1= new Employee( 1,"ABC", 111, 1000);
		e1.display();
		
		Employee e2= new Employee(2,"BCD", 222,2000);
		//e2.getData();
		e2.display();
	}
	
}






















/*void getData(int uid, String n, int id, int sal)
	{
		this.uid=uid;
		this.name = n;
		eid=id;
		salary=sal;
	}
	
*/