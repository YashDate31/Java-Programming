import javax.swing.*;
import java.awt.*;
class jlabel extends JFrame
{
    jlabel()
    {
        setTitle("Jlabel demo");
        setSize(100,200);
        setVisible(true);
        ImageIcon ii = new ImageIcon("download.jpg");
        JLabel j = new JLabel("virat",ii,JLabel.LEADING);
        j.setBounds(100,200,50,80);
        add(j);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public static void main(String a[])
    {
        jlabel j1 = new jlabel();

    }
}