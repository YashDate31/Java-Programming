package Manual.Unit_3_AWT_and_Swing.Pr18_JComboBox;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox Demo");

        String[] branches = {"AI", "CO", "IF", "CM"};
        JComboBox<String> comboBox = new JComboBox<>(branches);
        comboBox.setBounds(90, 70, 180, 30);

        frame.setLayout(null);
        frame.add(comboBox);
        frame.setSize(380, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
