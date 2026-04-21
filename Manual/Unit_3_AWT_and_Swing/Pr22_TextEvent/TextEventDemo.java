package Manual.Unit_3_AWT_and_Swing.Pr22_TextEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TextEventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Event Demo");
        frame.setLayout(null);

        JTextField textField = new JTextField();
        textField.setBounds(80, 50, 220, 30);

        JLabel label = new JLabel("Typed text: ");
        label.setBounds(80, 100, 240, 30);

        textField.getDocument().addDocumentListener(new DocumentListener() {
            private void updateLabel() {
                label.setText("Typed text: " + textField.getText());
            }

            public void insertUpdate(DocumentEvent e) { updateLabel(); }
            public void removeUpdate(DocumentEvent e) { updateLabel(); }
            public void changedUpdate(DocumentEvent e) { updateLabel(); }
        });

        frame.add(textField);
        frame.add(label);
        frame.setSize(400, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
