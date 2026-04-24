class A extends Thread
{
    public void run()
    {
    for(int i=1;i<=5;i++)
    {
        System.out.println("Thread A: "+ i);
    }
    }
}
class B extends Thread
{
    public void run()
    {
    for(int j=1;j<=5;j++)
    {
        System.out.println("Thread B: "+ j);
    }
}
}

class basic {
    public static void main(String[] args) {
        B b1 = new B();
        A a1 = new A();
        a1.start();
        b1.start();
    }
}