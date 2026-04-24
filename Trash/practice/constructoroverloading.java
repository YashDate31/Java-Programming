
public class constructoroverloading {

    public static void main(String args[])
    {
    student s = new student();
        student s1 = new student(10);
    s1.display();
    student s2 = new student(110,"rajuu");
    s2.display();

    }


    
}
class student{
    int rollno;
    String name;
    student()
    {
        System.out.println("This is default class");
    }

    student(int a)
    {
        name = "yash";
        rollno = 23;
    }
    student(int a, String b)
    {
        rollno= a;
        name = b;
    }

    void display()
    {
        System.out.println("name ="+name);
        System.out.println("Roll no "+ rollno);
    }
}