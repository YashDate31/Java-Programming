import java.awt.*;
import java.awt.event.*;

public class buttonEvent extends Frame implements ActionListener{
    Button b1;


    buttonEvent()
    {
            b1 = new Button("Press her");
            add(b1);

            b1.addActionListener(this);
            setTitle("Button Action Event");
            setSize(500,500);
            setVisible(true);


    }
    public void actionPerformed(ActionEvent e)
    {
            System.out.println("Button dabana nahi tha!!!!!!");
    }

    public static void main(String[] args) {
        buttonEvent b = new buttonEvent();
    }
}


