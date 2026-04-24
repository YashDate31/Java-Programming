import javax.swing.*;
import javax.swing.tree.*;

public class TreeExample {
    public static void main(String[] args) {

        JFrame f = new JFrame("JTree Example");

        // Create root
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Languages");

        // Create child nodes
        DefaultMutableTreeNode n1 = new DefaultMutableTreeNode("C");
        DefaultMutableTreeNode n2 = new DefaultMutableTreeNode("C++");
        DefaultMutableTreeNode n3 = new DefaultMutableTreeNode("Java");
        DefaultMutableTreeNode n4 = new DefaultMutableTreeNode("c dbms");

        n1.add(n4);


        // Add children to root
        root.add(n1);
        root.add(n2);
        root.add(n3);

        // Create tree
        JTree tree = new JTree(root);

        // Add scroll (important)
        JScrollPane sp = new JScrollPane(tree);

        f.add(sp);
        f.setVisible(true);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}