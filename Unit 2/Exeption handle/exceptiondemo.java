
public class exceptiondemo {
    public static void main(String[] args) {
        int a= 10;
        int b =0;

        try{
            int c = a/b;
            System.out.println("sum:-"+c);
        }

        catch(Exception e)
        {
            System.out.println("devide by zero");
        }
    }
    
}
