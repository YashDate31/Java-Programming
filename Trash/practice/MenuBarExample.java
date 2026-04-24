import javax.swing.*;

import java.awt.Frame;
import java.awt.event.*;

public class MenuBarExample {
    public static void main(String[] args) {

        // Create Frame
        Frame f = new Frame();
        //JFrame frame = new JFrame("Menu Bar Example");
        f.setSize(400, 300);
        // Create Menu Bar
        JMenuBar menuBar = new JMenuBar();

        // Create Menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        // Create Menu Items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");

        // Add Action Listener
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Add items to menus
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator(); // line separator
        fileMenu.add(exitItem);

        editMenu.add(cutItem);
        editMenu.add(copyItem);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Set menu bar to frame
        f.add(menuBar);

        f.setVisible(true);
    }
}