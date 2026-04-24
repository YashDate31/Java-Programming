
class A
{
void displayA()
{
System.out.println("Class A");
}
}
class B extends A
{
void displayB()
{
System.out.println("Class B");
}
}

class inheritance 
{
	public static void main(String args[])
{
B b1 = new B();
b1.displayA();
b1.displayB();
	
}
}