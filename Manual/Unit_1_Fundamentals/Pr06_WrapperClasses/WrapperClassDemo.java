package Manual.Unit_1_Fundamentals.Pr06_WrapperClasses;

public class WrapperClassDemo {
    public static void main(String[] args) {
        int primitiveValue = 25;

        Integer boxedValue = Integer.valueOf(primitiveValue);
        int unboxedValue = boxedValue.intValue();

        System.out.println("Primitive: " + primitiveValue);
        System.out.println("Boxed Object: " + boxedValue);
        System.out.println("Unboxed Primitive: " + unboxedValue);
    }
}
