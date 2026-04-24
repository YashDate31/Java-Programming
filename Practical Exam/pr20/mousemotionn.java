import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class mousemotionn extends JFrame implements MouseMotionListener{
    mousemotionn()
    {
    setTitle("mouse");
    setSize(400,500);
    setVisible(true);
    setLayout(new FlowLayout());
    addMouseMotionListener(this);

    }
    public void mouseDragged(MouseEvent e)
    {
        System.out.println("dragged");
    }
    public void mouseMoved(MouseEvent e)
    {
        System.out.println("moviing");
    }
    
    public static void main(String[] args) {
        {
            mousemotionn m = new mousemotionn();
            
        }
    }
}
