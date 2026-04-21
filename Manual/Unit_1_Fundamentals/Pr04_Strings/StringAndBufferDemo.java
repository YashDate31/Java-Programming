package Manual.Unit_1_Fundamentals.Pr04_Strings;

public class StringAndBufferDemo {
    public static void main(String[] args) {
        String name = "Java Programming";
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Substring(0, 4): " + name.substring(0, 4));

        StringBuffer buffer = new StringBuffer("MSBTE");
        buffer.append(" Lab");
        buffer.insert(0, "Java ");
        buffer.replace(0, 4, "Core");
        System.out.println("StringBuffer result: " + buffer);
        System.out.println("Reversed: " + new StringBuffer(buffer).reverse());
    }
}
