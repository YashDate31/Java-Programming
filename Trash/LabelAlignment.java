import java.awt.*;

public class LabelAlignment {
    public static void main(String[] args) {

        Frame f = new Frame("Label Alignment Example");

        // Create Labels with different alignments
        Label l1 = new Label("Left Alignment", Label.RIGHT);
      

        // Set positions
        l1.setBounds(100, 80, 200, 30);

        // Add labels to frame
        f.add(l1);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}