import java.util.*;

 interface Shape
{
	 void getData();
	 void calArea();
	 void show();
}

class Square implements Shape
{
	int a;
	float area;
	public void getData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter side: ");
		a=sc.nextInt();
	}
	void calArea()
	{
		area=a*a;
	}
	public void show()
	{
		System.out.println("Area is "+ area);
	}
}

class InterfaceDemo
{
	public static void main(String [] args)
	{
		Square s= new Square();
		s.getData();
		s.calArea();
		s.show();
	}
}