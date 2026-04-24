import java.awt.*;

class MyFrame extends Frame{
    MyFrame()
    {
        setLayout(getLayout());
        setSize(500,800);
        setTitle("My Frame");
        setVisible(true);
        Label l1 = new Label("Name ");
       // l1.setText("Name: ");
        l1.setAlignment(Label.CENTER);
        add(l1);

        Button b1 = new Button();
        b1.setLabel("hey");
        add(b1);

        TextField t = new TextField();
        
    }
    
}
public class create_frame {
    public static void main(String[] args) {
        
    MyFrame f1 = new MyFrame();
    }
    
}
