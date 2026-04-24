import java.awt.*;

public class GridLayoutDemo extends Frame
{
    GridLayoutDemo()
    {
        // Set frame title
        setTitle("GridLayout Example");

        // Set GridLayout (3 rows, 3 columns)
        setLayout(new BorderLayout());

        // Create buttons
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");

        // Add buttons to frame
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);

        // Set frame size
        setSize(300,300);

        // Make frame visible
        setVisible(true);
    }

    public static void main(String args[])
    {
        new GridLayoutDemo();
    }
}