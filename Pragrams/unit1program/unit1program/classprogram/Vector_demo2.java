import java.util.*; 
class Vector_demo2 
{ 
    public static void main(String[] arg) 
    { 
        Vector vec = new Vector(7); 
  
        vec.addElement(new Integer(1)); 
        vec.addElement(new Integer(2)); 
        vec.addElement(new Integer(3)); 
        vec.addElement(new Integer(4)); 
        vec.addElement(new Integer(5)); 
        vec.addElement(new Integer(6)); 
        vec.addElement(new Integer(7)); 
 
      System.out.println("elements in vector: " +vec); 
        
  
        int size=vec.size();

        Integer[] arr = new Integer[size]; 
  
        // copy componnent of vector int array arr 
        
        vec.copyInto(arr); 
  
        System.out.println("elements in array arr: "); 
        
       for (Integer num : arr) 
        { 
            System.out.println(num); 
        } 
    } 
} 