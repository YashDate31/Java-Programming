
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
class C extends B
{
void displayC()
{
System.out.println("Class c");
}
}

class inheritance_single 
{
	public static void main(String args[])
{
C b1 = new C();
b1.displayA();
b1.displayB();
b1.displayC();
	
}
}