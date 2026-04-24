class Base1
{  
	Base1()
	{
	System.out.println("I am Base class constructor");
	}  
}  

class derived1 extends Base1
{  
	derived1()
	{  
	System.out.println("I am derived class constructor");  
	}  
} 
 
class TestSuper_con
{  
public static void main(String args[])
{  
derived1 d=new derived1();  
}
}  