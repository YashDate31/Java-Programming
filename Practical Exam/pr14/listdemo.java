import java.awt.*;
class listdemo extends Frame
{
	listdemo()
	{
	setTitle("List");
	setVisible(true);
	setLayout(new FlowLayout());
	setSize(500,500);
	
	List l1 =  new List(1);
	l1.add("mumbai");
	l1.add("pune");
	add(l1);
		
	}
	
	public static void main(String args[])
	{
		listdemo l =new  listdemo();
	}

}