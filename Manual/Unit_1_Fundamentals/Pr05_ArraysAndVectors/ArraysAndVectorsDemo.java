package Manual.Unit_1_Fundamentals.Pr05_ArraysAndVectors;

import java.util.Vector;

public class ArraysAndVectorsDemo {
    public static void main(String[] args) {
        int[] marks = {72, 81, 90, 68, 88};
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        System.out.println("Array total: " + total);

        Vector<String> subjects = new Vector<>();
        subjects.add("Java");
        subjects.add("DBMS");
        subjects.add("CN");

        System.out.println("Vector elements:");
        for (String subject : subjects) {
            System.out.println(subject);
        }
    }
}
