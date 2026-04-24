final class Base
 { 
     void fun() 
{ 
System.out.println("Base fun() called"); 
} 
} 

   
class Derived extends Base
 {

     void fun() 
{ 
System.out.println("Derived fun() called"); 
} 
} 
   
class final_class_demo
{ 
    public static void main(String args[])
 {  
       Derived d = new Derived(); 
       d.fun(); 
    } 
}  