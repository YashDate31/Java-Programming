import javax.swing.*;
import java.awt.*;
public class jtable extends JFrame{
    jtable()
    {
    setTitle("tree");
    setSize(400,500);
    setVisible(true);
    setLayout(new FlowLayout());
    String column[]= {"Name","Roll no"};
    String data[][]= {
                    {"Yash","08"},
                     {"ram","09"}
                    };

    JTable j = new JTable(data,column);

    //JScrollPane j1 = new JScrollPane(j);
    add(j);
    }
    public static void main(String args[])
    {
         jtable j = new jtable();
    }
    
    
}
