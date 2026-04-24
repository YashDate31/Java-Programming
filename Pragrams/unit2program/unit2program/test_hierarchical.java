class A
{
    
    void display1()
    {
      System.out.println("Class A method");  
    }
}
class B extends A
{
    
    void display2()
    {
      System.out.println("Class B method");  
    }
}
class C extends A
{
    
    void display3()
    {
      System.out.println("Class C method");  
    }
}

class test_hierarchical
{
	public static void main(String args[])
    {
        B b1=new B();
        b1.display1();
        b1.display2();

        C c1=new C();
        c1.display1();
        
        c1.display3();

    }
}