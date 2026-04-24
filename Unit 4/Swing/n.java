import javax.swing.*;
import java.awt.*;

// Panel 1
class JPanel1 extends JPanel
{
    JPanel1()
    {
        JButton b1 = new JButton("OK");
        JButton b2 = new JButton("CANCEL");
        JButton b3 = new JButton("RETRY");

        add(b1);
        add(b2);
        add(b3);
    }
}

// Panel 2
class JPanel2 extends JPanel
{
    JPanel2()
    {
        JCheckBox b1 = new JCheckBox("C Lang");
        JCheckBox b2 = new JCheckBox("C++ Lang");
        JCheckBox b3 = new JCheckBox("Java Lang");

        add(b1);
        add(b2);
        add(b3);
    }
}

// Panel 3
class JPanel3 extends JPanel
{
    JPanel3()
    {
        JComboBox<String> jcb = new JComboBox<>();

        jcb.addItem("India");
        jcb.addItem("UK");
        jcb.addItem("US");

        add(jcb);
    }
}

// Main Frame
class n extends JFrame
{
    n()
    {
        setTitle("VJTech Frame");

        JTabbedPane jtp = new JTabbedPane();

        // Create panels
        JPanel1 p1 = new JPanel1();
        JPanel2 p2 = new JPanel2();
        JPanel3 p3 = new JPanel3();

        // Add tabs
        jtp.addTab("Buttons", p1);
        jtp.addTab("CheckBox", p2);
        jtp.addTab("ComboBox", p3);

        add(jtp);

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[])
    {
        new n();
    }
}