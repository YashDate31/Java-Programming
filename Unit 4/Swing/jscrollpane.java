import java.awt.*;
import javax.swing.*;

class img extends JFrame{
    img()
    {
        ImageIcon ii = new ImageIcon("download.jpg");
        JButton j = new JButton("press",ii);
        add(j);
        JScrollPane p1 = new JScrollPane(j,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        add(p1);
        setVisible(true);
        setSize(100,300);

    }
}
public class jscrollpane {
    public static void main(String a[])
    {
    img i = new img();
    }

    
}
