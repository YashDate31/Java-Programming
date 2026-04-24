import java.util.Vector;

public class ArraysAndVectorsDemo {
    public static void main(String[] args) {
        int[] marks = {72, 81, 90, 68, 88};
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        System.out.println("Array total: " + total);

        Vector subjects = new Vector(1);
        subjects.add("Java");
        subjects.add("DBMS");
        subjects.addElement(new Integer(100));
        subjects.insertElementAt(1,1);
        subjects.add("CN");

        System.out.println("Vector elements:");
       System.out.print(subjects);
    }
}
