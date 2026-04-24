import java.awt.*;
import java.awt.event.*;

class textEvent1 extends Frame implements TextListener {
    TextField t1,t2;
    textEvent1()
    {
        setLayout(new FlowLayout());
        t1 = new TextField("Enter Your Name");
        add(t1);
        t1.addTextListener(this);
        t2 = new TextField(25);
        add(t2);

        setTitle("Text Event");
        setSize(500,500);
        setVisible(true);
    
    }
    public void textValueChanged(TextEvent e)
    {
       
        String a = t1.getText();
        t2.setText(a);
        
        

    }

    public static void main(String[] args) {
        textEvent1 t = new textEvent1();
    }
    
}
