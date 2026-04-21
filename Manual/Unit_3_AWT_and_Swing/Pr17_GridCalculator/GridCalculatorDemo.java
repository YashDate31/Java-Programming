package Manual.Unit_3_AWT_and_Swing.Pr17_GridCalculator;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GridCalculatorDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Calculator Layout");
        frame.setLayout(new GridLayout(4, 4, 5, 5));

        frame.add(new JTextField());
        frame.add(new JButton("C"));
        frame.add(new JButton("="));
        frame.add(new JButton("+"));

        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("-"));

        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("*"));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("/"));

        frame.setSize(320, 260);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
