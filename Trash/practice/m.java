import java.util.*;
public class m {

  public static void main(String args[]) 
  { 
     Vector v1=new Vector(); 
     v1.addElement(new Integer(10)); 
     v1.addElement(new Integer(30)); 
     v1.addElement(new Integer(60)); 
     v1.addElement(new Integer(70)); 
     v1.addElement(new Integer(80)); 
     v1.addElement(new Integer(100)); 
     System.out.println("Initial Vector Size = "+v1.size()); 
     v1.removeElementAt(3); 
     v1.removeElementAt(4);
     v1.indexOf(10) ;
     v1.insertElementAt(new Integer(150),3); 
     System.out.println("Final Vector Size = "+v1.size()); 
  } 
} 
 
 
 
 
 
 
 

