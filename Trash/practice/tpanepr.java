import javax.swing.*;
import java.awt.*;
class tab1 extends JPanel
{
    tab1()
    {
    JButton b = new JButton("Button");
    add(b);
    }

}

class tab2 extends JPanel
{
    tab2()
    {
    JCheckBox b = new JCheckBox("C");
    JCheckBox b1 = new JCheckBox("C");
    JCheckBox b2 = new JCheckBox("C");
    add(b);
    add(b1);
    add(b2);
    }
}

public class tpanepr {
    public static void main(String a[])
    {
        JTabbedPane p1 = new JTabbedPane();
        tab1 t1 = new tab1();
        tab2 t2 = new tab2();
        p1.addTab("tab1",t1);
        p1.addTab("tab2", t2);
        JFrame p3 = new JFrame();
        p3.add(p1);
        p3.setVisible(true);
        p3.setSize(200,200);
    }
    
}
