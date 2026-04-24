import java.awt.*;
class border extends Frame
{
    border()
    {
    setTitle("List");
	setVisible(true);
	setLayout(new BorderLayout(3,4));
	setSize(500,500);

    Button b1 = new Button("west");
    Button b2 = new Button("east");
    Button b3 = new Button("north");
    Button b4 = new Button("sounth");
    Button b5 = new Button("center");

    add(b1,BorderLayout.WEST);
    add(b2,BorderLayout.EAST);
    add(b3,BorderLayout.NORTH);
    add(b4,BorderLayout.SOUTH);
    add(b5,BorderLayout.CENTER);



    }
    public static void main(String argsp[])
    {
        border b = new border();
    }

}