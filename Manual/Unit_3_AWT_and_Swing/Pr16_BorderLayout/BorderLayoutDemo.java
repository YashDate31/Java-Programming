package Manual.Unit_3_AWT_and_Swing.Pr16_BorderLayout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout Demo");
        frame.setLayout(new BorderLayout());

        frame.add(new JButton("Top"), BorderLayout.NORTH);
        frame.add(new JButton("Bottom"), BorderLayout.SOUTH);
        frame.add(new JButton("Left"), BorderLayout.WEST);
        frame.add(new JButton("Right"), BorderLayout.EAST);
        frame.add(new JButton("Center"), BorderLayout.CENTER);

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
