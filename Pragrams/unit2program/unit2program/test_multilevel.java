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
class C extends B
{
    
    void display3()
    {
      System.out.println("Class C method");  
    }
}

class test_multilevel
{
	public static void main(String args[])
    {
        C c1=new C();
        c1.display1();
        c1.display2();
        c1.display3();


    }
}