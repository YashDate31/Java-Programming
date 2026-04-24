import javax.swing.*;

public class ComboSetExample {
    public static void main(String[] args) {

        JFrame f = new JFrame("JComboBox Example");

        String items[] = {"C", "C++", "Java", "Python"};

        JComboBox cb = new JComboBox(items);

        // Set default selected item
        cb.setSelectedItem("Java");

        cb.setBounds(50, 50, 100, 30);

        f.add(cb);

        f.setSize(300, 200);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}