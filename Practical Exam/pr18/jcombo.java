import java.awt.*;
import javax.swing.*;
public class jcombo extends JFrame {
    jcombo()
    {
    setTitle("jcombo");
	setVisible(true);
	setLayout(new BorderLayout(3,4));
	setSize(500,500);

    String arr[]={"Pune","Mumbai","Ane","Thane"};

    JComboBox j1 = new JComboBox(arr);
    add(j1,BorderLayout.WEST);

    j1.addItem("yasb");
    }

    public static void main(String args[])
    {
        jcombo b =new jcombo();
    }

}
