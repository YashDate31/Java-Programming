import java.awt.*;
class form extends Frame
{
	form()
	{
	setTitle("Radio Button");
	setVisible(true);
	setLayout(new FlowLayout());
	setSize(500,500);
	
	Label l1 = new Label("Enter Your Name: ");
	TextField t1 = new TextField("eg. Yash");
	Label l2 = new Label("Enter Your Experience: ");
	TextArea t2 = new TextArea("here",10,20,TextArea.SCROLLBARS_BOTH);
	Button b1 = new Button("Submit");
	
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(b1);
	
	}
	
	public static void main(String args[])
	{
		form f = new form();
	}
}
