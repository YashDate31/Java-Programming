import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class key extends JFrame implements KeyListener
{
    key()
    {
        setTitle("Keyboard");
        setSize(400,300);
        setLayout(new FlowLayout());

        addKeyListener(this);

        setVisible(true);
    }

    public void keyPressed(KeyEvent e)
    {
        System.out.println("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e)
    {
        System.out.println("Key Released: " + e.getKeyChar());
    }

    public void keyTyped(KeyEvent e)
    {
        System.out.println("Key Typed: " + e.getKeyChar());
    }

    public static void main(String args[])
    {
        new key();
    }
}