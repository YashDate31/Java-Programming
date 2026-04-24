class Adder
{  

 int add(int a, int b)
 {
   return a+b;
 }  
 double add(double a, double b)
  {
    return a+b;
  } 
 int add(int a,int b,int c)
  {
  return a+b+c;
  } 
}  
class TestOverloading2
{  
   public static void main(String[] args)
  { 
    Adder a1=new Adder(); 
    System.out.println(a1.add(11,11));  
    System.out.println(a1.add(12.3,12.6));  
    System.out.println(a1.add(12,12,61));
  }
}  