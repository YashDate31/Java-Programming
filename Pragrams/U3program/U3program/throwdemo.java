public class throwdemo
{  
   void validate(int age)
   {  
     if(age<18)  
      throw new ArithmeticException("not valid");  
     else  
      System.out.println("welcome to vote");  
   }  
   public static void main(String args[])
  {  
      throwdemo d1=new throwdemo();
	d1.validate(21);  
        
  }  
}  