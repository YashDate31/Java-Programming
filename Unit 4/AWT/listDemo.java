import java.awt.*;
import javax.swing.*;

class listDemo extends JFrame {

    listDemo() {
        List l = new List(4, true); // 4 items visible, multiple select

        l.add("Java");
        l.add("Python");
        l.add("C++");
        l.add("C");
        l.add("HTML");

        l.setBounds(100, 100, 100, 80);

        add(l);

        setSize(300, 300);
        setLayout(null);
        setTitle("List Example");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new listDemo();
    }
}