//#The JTree is used to display data in a hierarchical (tree) structure.

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class treee extends JFrame {
treee()
{
    setTitle("tree");
    setSize(400,500);
    setVisible(true);
    setLayout(new FlowLayout());

   
   DefaultMutableTreeNode root = new DefaultMutableTreeNode("lan");
   DefaultMutableTreeNode t1 = new DefaultMutableTreeNode("c");
   DefaultMutableTreeNode t2 = new DefaultMutableTreeNode("cpp");
   DefaultMutableTreeNode t3 = new DefaultMutableTreeNode("oop");
      DefaultMutableTreeNode t5 =new  DefaultMutableTreeNode("java");
   DefaultMutableTreeNode t4 = new DefaultMutableTreeNode("pop");
   
   root.add(t1);
   root.add(t2);
   root.add(t5);
   t2.add(t3);
   t2.add(t4);
   
    JTree j = new JTree(root);
    add(j);

}
public static void main(String args[])
{
	treee t1 = new treee();
}
    
}
