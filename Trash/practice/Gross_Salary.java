import java.util.*;

// Interface Salary
interface Salary {

    // explicitly written (normally implicit)
    public static final int Basic_Salary = 10000;

    // abstract method
     abstract void Basic_Sal();
}

// Class Employee
class Employee {

    String name;
    int age;

    void Display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Class Gross_Salary
class Gross_Salary extends Employee implements Salary {

    int TA, DA, HRA;

    // Implementing abstract method
    public void Basic_Sal() {
        System.out.println("Basic Salary: " + Basic_Salary);
    }

    void Total_Sal() {

        TA = 2000;
        DA = 3000;
        HRA = 1500;

        int total = Basic_Salary + TA + DA + HRA;

        System.out.println("TA: " + TA);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("Total Salary: " + total);
    }

    public static void main(String args[]) {

        Gross_Salary g = new Gross_Salary();

        g.name = "Yash";
        g.age = 20;

        g.Display();
        g.Basic_Sal();
        g.Total_Sal();
    }
}
