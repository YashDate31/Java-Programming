public class try_catch {
    public static void main(String args[])
    {
        int a=10,b=10;
        int c;

        try{
            c=a/b;
            System.out.println("ans: "+c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally
        {
            System.out.println("this is finally block");
        }
    }
    
}
