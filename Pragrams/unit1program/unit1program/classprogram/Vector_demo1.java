import java.util.*; 
class Vector_demo1 
{ 
    public static void main(String[] arg) 
    { 
        Vector vec = new Vector(7); 
          // use add() method to add elements in the vector 
        vec.add(10); 
        vec.add(20); 
        vec.add(30); 
        vec.add(40); 
        vec.add(50); 
        vec.add(60); 
        vec.add(70); 
    System.out.println("Vector before removal: " + vec);
          // remove an element 
        vec.removeElementAt(5); 
          // checking vector 
        System.out.println("Vector after removal: " + vec); 

vec.removeAllElements();
System.out.println("Vector after removal all element: " + vec);

vec.insertElementAt(100,0);
vec.add(200);

System.out.println("elements in vector: " +vec); 



    } 
} 