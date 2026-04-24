class Shape 
{
    int length;
    int breadth;
      private int area;
}
 class Rectangle extends Shape
{
    public void calculateArea()
    {
        area = length*breadth;
        System.out.println("Area : "+ area);
    }
}

class single_inheritance
{
	public static void main(String args[])
    {
        Rectangle r = new Rectangle();

        //Assigning values to Shape class attributes

        r.length = 10;
        r.breadth = 20;

        //Calculate the area
        r.calculateArea();

        
    }
}