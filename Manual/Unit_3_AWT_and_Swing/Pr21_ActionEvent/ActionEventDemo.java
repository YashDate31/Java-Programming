package Manual.Unit_3_AWT_and_Swing.Pr21_ActionEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ActionEventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Action Event Demo");
        frame.setLayout(null);

        JLabel label = new JLabel("Click button");
        label.setBounds(120, 40, 180, 30);

        JButton button = new JButton("Click Me");
        button.setBounds(120, 90, 120, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });

        frame.add(label);
        frame.add(button);
        frame.setSize(380, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
