import java.util.*;
import java.awt.*;
import javax.swing.*;
class jbuttondemo extends JFrame{
    
    jbuttondemo()
    {
    ImageIcon i1 = new ImageIcon("C:\\Users\\Yash\\OneDrive\\Desktop\\Java\\Trash\\yash.jpg");
    JButton b1 = new JButton("Yash",i1);
    add(b1);
    setSize(400,500);
    setBounds(100,200,20,40);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }


    public static void main(String a[])
    {
        jbuttondemo b1 = new jbuttondemo();
    }
}

    

