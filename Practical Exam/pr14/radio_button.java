import java.awt.*;
class radio_button extends Frame
{
	radio_button()
	{
		setTitle("Radio Button");
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(500,500);
		
		CheckboxGroup g = new CheckboxGroup();
		Checkbox c1 = new Checkbox("C",true,g);
		Checkbox c2 = new Checkbox("Java",true,g);
		Checkbox c4 = new Checkbox("Php",true,g);
		Checkbox c5 = new Checkbox("dbms",true ,g);
		Checkbox c6 = new Checkbox("dsu",true,g);
		add(c1);
		add(c2);
		add(c4);
		add(c6);
		add(c4);
		
		
	}
	public static void main(String args[])
	{
		radio_button r = new radio_button();
	}
}