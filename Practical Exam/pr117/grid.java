import java.awt.*;


public class grid extends Frame {
    grid()
    {
    setTitle("List");
	setVisible(true);
	setLayout(new GridLayout(3,2));
	setSize(500,500);

    Button b1 = new Button("west");
    Button b2 = new Button("east");
    Button b3 = new Button("north");
    Button b4 = new Button("sounth");
    Button b5 = new Button("center");

    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);

    
    }
    public static void main(String a[])
    
    {
        grid g1 = new grid();
    }
}
