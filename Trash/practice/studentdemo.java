//WAP to create class Student having data members rollno,name and marks.Accept and display data for one student. 
import java.util.*;
public class studentdemo {
    public static void main(String[] args) {

        student s1[] = new student[2];

        for(int i=0;i<2;i++)
        {
            s1[i]= new student();
            s1[i].getdata();


        }
        for(int i=0;i<2;i++)
        {
            s1[i].display();

            
        }

        

        
    }
    
}

class student{
    int rn;
    String name1;
    int marks;

    
    void getdata()
    {
        System.out.println("Enter the roll no , name, and marks");
        Scanner sc =new Scanner(System.in);
        rn = sc.nextInt();
        name1 = sc.next();
        marks = sc.nextInt();
    
    }

    void display()
    {
         System.out.println("Name: "+name1);
         System.out.println("roll no: "+rn);
         System.out.println("marks: "+marks);

    }

}
