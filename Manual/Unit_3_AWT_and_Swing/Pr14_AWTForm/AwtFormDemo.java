package Manual.Unit_3_AWT_and_Swing.Pr14_AWTForm;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;

public class AwtFormDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Form Demo");
        frame.setLayout(null);

        Label nameLabel = new Label("Name:");
        nameLabel.setBounds(40, 60, 80, 30);

        TextField nameField = new TextField();
        nameField.setBounds(120, 60, 150, 30);

        Button submit = new Button("Submit");
        submit.setBounds(120, 110, 80, 30);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(submit);

        frame.setSize(350, 220);
        frame.setVisible(true);
    }
}
