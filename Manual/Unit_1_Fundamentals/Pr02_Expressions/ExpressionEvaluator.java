package Manual.Unit_1_Fundamentals.Pr02_Expressions;

public class ExpressionEvaluator {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        double division = (double) a / b;
        int modulus = a % b;

        int result = (a + b) * 2 - (a / b);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);
        System.out.println("Final Expression Result: " + result);
    }
}
