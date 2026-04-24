import java.awt.*;

class num
{
    public static void main(String args[])
    {
        Frame f = new Frame();

        // 2 rows, 5 columns (10 buttons)
        f.setLayout(new GridLayout(2, 5));

        for(int i = 0; i <= 9; i++)
        {
            f.add(new Button(String.valueOf(i)));
        }

        f.setSize(300, 200);
        f.setVisible(true);
    }
}