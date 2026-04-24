 public class Testfinalize
{


    protected void finalize() throws Throwable
    {
        System.out.println("Garbage Collected");
    }


    public static void main(String[] args)
    {
        Testfinalize t = new Testfinalize();
        t=null;
        System.gc();
        System.out.println("end of Garbage Collection");
    }


   
}