package Manual.Unit_2_OOP_and_Exceptions.Pr09_Interface;

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Report implements Printable, Showable {
    public void print() {
        System.out.println("Printing report...");
    }

    public void show() {
        System.out.println("Showing report on screen...");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Report report = new Report();
        report.print();
        report.show();
    }
}
