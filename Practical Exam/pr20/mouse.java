import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class mouse extends JFrame implements MouseListener
{
	mouse()
	{
	setTitle("mouse");
    setSize(400,500);
    setVisible(true);
    setLayout(new FlowLayout());
	
	addMouseListener(this);
	
	}
	public void mouseEntered(MouseEvent e)
	{
		System.out.println("mouse entered");
		
	}
	public void mouseClicked(MouseEvent e)
	{}
	public void mouseExited(MouseEvent e)
	{}
	public void mousePressed(MouseEvent e)
	{}
	public void mouseReleased(MouseEvent e)
	{}
	
	public static void main(String a[])
	{
	mouse m = new mouse();
	}
	
	
}