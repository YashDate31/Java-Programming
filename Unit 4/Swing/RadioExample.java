import javax.swing.*;

public class RadioExample {
    public static void main(String[] args) {

        JFrame f = new JFrame("JRadioButton Example");

        ImageIcon ii = new ImageIcon("download.jpg"); 
        JRadioButton r1 = new JRadioButton("Male", ii);
        JRadioButton r2 = new JRadioButton("Female");

        // Increase size for image
        r1.setBounds(50, 50, 200, 80);
        r2.setBounds(50, 140, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        f.add(r1);
        f.add(r2);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}