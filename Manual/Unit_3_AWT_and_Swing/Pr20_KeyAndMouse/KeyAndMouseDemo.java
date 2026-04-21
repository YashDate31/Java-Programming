package Manual.Unit_3_AWT_and_Swing.Pr20_KeyAndMouse;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyAndMouseDemo extends JFrame implements KeyListener, MouseListener {
    private final JTextArea area;

    public KeyAndMouseDemo() {
        setTitle("Key and Mouse Event Demo");
        setSize(420, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        area = new JTextArea();
        add(area);

        area.addKeyListener(this);
        area.addMouseListener(this);
    }

    public void keyTyped(KeyEvent e) {
        area.append("Key typed: " + e.getKeyChar() + "\n");
    }

    public void keyPressed(KeyEvent e) { }
    public void keyReleased(KeyEvent e) { }

    public void mouseClicked(MouseEvent e) {
        area.append("Mouse clicked at: " + e.getX() + "," + e.getY() + "\n");
    }

    public void mousePressed(MouseEvent e) { }
    public void mouseReleased(MouseEvent e) { }
    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }

    public static void main(String[] args) {
        new KeyAndMouseDemo().setVisible(true);
    }
}
