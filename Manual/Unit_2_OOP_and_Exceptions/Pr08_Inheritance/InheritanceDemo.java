package Manual.Unit_2_OOP_and_Exceptions.Pr08_Inheritance;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    int rollNo;

    Student(String name, int rollNo) {
        super(name);
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + rollNo);
    }
}

class Result extends Student {
    int marks;

    Result(String name, int rollNo, int marks) {
        super(name, rollNo);
        this.marks = marks;
    }

    void showResult() {
        display();
        System.out.println("Marks: " + marks);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Result r = new Result("Yash", 21, 89);
        r.showResult();
    }
}
