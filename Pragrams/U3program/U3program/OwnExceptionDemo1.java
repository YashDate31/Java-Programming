class MyException extends Exception
 {
   
   public String toString()
   {
      return "CustomException: u r younger to vote ";
   }
}

public class OwnExceptionDemo1 
{
   public static void main(String args[])
 {
   
      try 
      {
         int age =Integer.parseInt(args[0]);
         if (age < 18)
			throw new MyException();
		 else
			System.out.println("Welcome to voting");
      } 
     catch(MyException ex1) 
      {
         System.out.println(ex1);
      }
   }
}