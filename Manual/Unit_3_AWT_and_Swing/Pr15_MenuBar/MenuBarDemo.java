package Manual.Unit_3_AWT_and_Swing.Pr15_MenuBar;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuBarDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("Menu Bar Demo");

        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem exitItem = new MenuItem("Exit");

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        frame.setMenuBar(menuBar);
        frame.setSize(400, 250);
        frame.setVisible(true);
    }
}
