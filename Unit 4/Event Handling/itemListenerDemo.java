import java.awt.*;
import java.awt.event.*;

class itemEvent extends Frame implements ItemListener {

    List l1;
    
    Checkbox c1,c2,c3,c4;

    itemEvent()
    {
        l1 = new List(2);

       // l1.addItem("Java");
        l1.add("C");
        l1.add("C++");

        add(l1);


         c1 = new Checkbox("Yash");
         c2 = new Checkbox("Sarthak");
         c3 = new Checkbox("Ganesh");
         c4 = new Checkbox("Varad");

        add(c1);
        add(c2);
        add(c3);
        add(c4);

       
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);

        l1.addItemListener(this);

        setSize(300,300);
        setVisible(true);
        setLayout(new FlowLayout());
    }

    public void itemStateChanged(ItemEvent e)
    {
        System.out.println("Item Selected");
    }
}

public class itemListenerDemo {
    public static void main(String[] args) {

        itemEvent i = new itemEvent();

    }
}