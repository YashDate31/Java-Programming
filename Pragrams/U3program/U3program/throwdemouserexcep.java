
import java.util.*;

class  myfirstexception extends Exception
{
	myfirstexception(String s)
	{
	super(s);
	}
}


public class throwdemouserexcep
{  
int age;
Scanner sc=new Scanner(System.in);
   void validate()
   {  
	try
	{
	System.out.println("enter the age");
	age=sc.nextInt();
     if(age<18)  
      throw new myfirstexception("not valid");  
     else  
      System.out.println("welcome to vote");  
      }  

 catch(myfirstexception e)
{
System.out.println(e);
}
}
   public static void main(String args[])
  {  
      throwdemouserexcep d1=new throwdemouserexcep();
	d1.validate();  
        
  }  
}  