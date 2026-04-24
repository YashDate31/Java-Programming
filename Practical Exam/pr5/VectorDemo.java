import java.util.*;
class VectorDemo
{
	public static void main(String args[])
	{
		Vector v = new Vector(10);
		v.addElement(new Integer(10));
		v.addElement(new Integer(20));
		v.addElement(new Integer(30));
		v.addElement(new Integer(40));
		System.out.println("Size:-"+ v.size());
		System.out.println(v);

		v.removeElement(20);
		v.insertElementAt(new Integer(100),1);
		System.out.println(v);
		
		
		
		System.out.println(v);
		
		
		
	}
}