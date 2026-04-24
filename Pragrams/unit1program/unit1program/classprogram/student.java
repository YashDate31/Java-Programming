class student
{
  String name = " Ram";
  int rollno = 24;

   void display()
   {
    System.out.println("Name:" +name);
    System.out.println("Rollno:" +rollno);
   }



  public static void main(String[] args)
  {
    student s1 = new student();
    s1.display();
  }
}

