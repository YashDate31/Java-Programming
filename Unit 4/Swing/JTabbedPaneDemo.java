import javax.swing.*;

class CorrectExample extends JFrame
{
    CorrectExample()
    {
        JTabbedPane tp = new JTabbedPane();

        JPanel p1 = new JPanel();
        p1.add(new JButton("Panel 1"));

        JPanel p2 = new JPanel();
        p2.add(new JButton("Panel 2"));

        JPanel p3 = new JPanel();
        p3.add(new JButton("Panel 3"));

        tp.addTab("Tab1", p1);
        tp.addTab("Tab2", p2);
        tp.addTab("Tab3", p3);

        add(tp);

        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new CorrectExample();
    }
}