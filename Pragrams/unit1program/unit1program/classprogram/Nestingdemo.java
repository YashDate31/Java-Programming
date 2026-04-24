class Nestingdemo
{

 void firstmethod()
  {
   System.out.println(" In the first method ");
  }

  void secondmethod()
  {
   firstmethod();
   System.out.println("  Now, In the second method ");
  }

  public static void main(String[] args)
  {
   Nestingdemo d1=new Nestingdemo();
   d1.secondmethod();
  }
}