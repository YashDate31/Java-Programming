package Manual.Unit_2_OOP_and_Exceptions.Pr12_TryCatchFinally;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
