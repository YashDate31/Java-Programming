import java.util.*;

 interface Shape
{
	double pi=3.142;
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
	public void calArea()
	{
		area=a*a;
	}
	public void show()
	{
		System.out.println("Area is "+area);
	}
}

class Circle implements Shape
{
	int r;
	double area;
	public void getData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter side: ");
		r=sc.nextInt();
	}
	public void calArea()
	{
		area=pi*r*r;
	}
	public void show()
	{
		System.out.println("Area is "+area);
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
		
		Circle c= new Circle();
		c.getData();
		c.calArea();
		c.show();
	}
}