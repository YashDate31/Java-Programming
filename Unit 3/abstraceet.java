abstract class Shape
{
    abstract void draw(); // abstract method

    void message()
    {
        System.out.println("This is shape");
    }
}

class Circle extends Shape
{
   public void draw()
    {
        System.out.println("Drawing Circle");
    }
}

class abstraceet
{
    public static void main(String args[])
    {
        Shape s = new Circle(); // reference of abstract class
        s.draw();
        s.message();
    }
}