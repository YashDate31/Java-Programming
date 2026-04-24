class person 
{
   String name="abc";
}

class student extends person 
{
   String name="xyz";

  void printname() 
  {
    System.out.println("I am a " + name);
    System.out.println("I am an " + super.name);
  }
}
class testsuperdemo2
 {
  public static void main(String[] args) 
  {
    student s = new student();
    s.printname();
  }
}