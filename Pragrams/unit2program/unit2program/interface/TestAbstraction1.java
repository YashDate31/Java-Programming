    abstract class Shape
    {  
    abstract void draw();
 
   }
    class Rectangle extends Shape
    {  
    void draw()
    {
      System.out.println("drawing rectangle");
    }  
    }  

    
    class TestAbstraction1
    {  
    public static void main(String args[])
    {  
    Shape s;
    s= new Rectangle();
    s.draw();
    }  
    }  

