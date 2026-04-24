import java.util.*;

class Employee
{
  String ename;
  int empid;
  double salary;
  
  void accept()
  {
  Scanner in=new Scanner(System.in);
  System.out.println("Enter empid");
  empid=in.nextInt();
  System.out.println("Enter name");
  ename=in.next();
  System.out.println("Enter salary");
  salary=in.nextDouble();
  } 

  void display()
   {
    
    System.out.println("emp_id:" + empid);
    System.out.println("emp_name:" + ename);
    System.out.println("emp_salary:" + salary);
   }

  public static void main(String []a)
  {
  
  Employee  e1[]=new Employee[3];
  int i;
 System.out.println("enter employee data");
 
  for(i=0;i<3;i++)
  {

  e1[i]= new Employee();
  e1[i].accept();
  }
  System.out.println("Employee data is ");
 
  for(i=0;i<3;i++)
  {
  
  e1[i].display();
  }

 }
}

