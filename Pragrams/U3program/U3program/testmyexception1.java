import java.lang.Exception;
class userexception extends Exception
{
String message="";
userexception(String message)
{
super(message);
}
}
class testmyexception1
{
public static void main(String args[])
{
String s1="java";
String s2="oops";

try
{
if (s2.equals(s1))
{
System.out.println("string is  match");

}
else
 
throw new userexception("string is not match ");

}
catch(userexception e)
{
System.out.println("caught my exception");
System.out.println(e.getMessage());
}

}
}
