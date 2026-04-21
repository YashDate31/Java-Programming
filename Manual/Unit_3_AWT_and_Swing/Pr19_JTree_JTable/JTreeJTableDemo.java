package Manual.Unit_3_AWT_and_Swing.Pr19_JTree_JTable;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;

public class JTreeJTableDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTree and JTable Demo");
        frame.setLayout(new GridLayout(1, 2));

        JTree tree = new JTree();

        String[] columns = {"Roll", "Name", "Marks"};
        String[][] data = {
                {"1", "Amit", "78"},
                {"2", "Yash", "89"},
                {"3", "Riya", "92"}
        };
        JTable table = new JTable(data, columns);

        frame.add(new JScrollPane(tree));
        frame.add(new JScrollPane(table));

        frame.setSize(520, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
