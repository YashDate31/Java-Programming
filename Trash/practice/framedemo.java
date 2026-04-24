import java.awt.*;
public class framedemo extends Frame{
    framedemo()
    {
        
        setSize(800,800);
        setVisible(true);

      setLayout(new FlowLayout());
        setTitle("Exam Form");
        System.out.println("Title : "+ getTitle());


        //label 

        Label l1 = new Label("Enter Your Name: ",Label.CENTER);
    //   l1.setBounds(150,100,150,200);
       // l1.setAlignment(Label.CENTER);
        add(l1);

        //text field 

        TextField t = new TextField("eg Yash",20);
       // t.setEchoChar('1');
       t.setEditable(false);
       //System.err.println(t.isEditable());


        add(t);
       



        
       

        //Check box
       CheckboxGroup g = new CheckboxGroup();
       Label l = new Label("Select Branch");
        add(l);

        Checkbox c1 = new Checkbox("Computer",true,g);
        Checkbox c2 = new Checkbox("Information Technology",false,g);
        Checkbox c3 = new Checkbox("E &tc",true,g);


        //text area 

        Label l2 = new Label("Tell about your college..");
        add(l2);
        
        TextArea t2 = new TextArea("eg hello..",6,30,TextArea.SCROLLBARS_BOTH);
        t2.append("...Thank u.");
        add(t2);

        add(c1);
        add(c2);
        add(c3);

        //choice
/* 
        Choice ch1 = new Choice();
        ch1.add("first year");
        ch1.add("Second year");
        ch1.add("Third year");

        ch1.select("Third year");


*/
        //list 

        List l5 = new List(4);  // 4 visible rows

        l5.add("Java");
        l5.add("Python");
        l5.add("C++");
        l5.add("C");

        l5.add("PHP");

        add(l5);




       // add(ch1);



        //buttons 

        Button b1 = new Button("Submit");
        add(b1);

    }

    public static void main(String a[])
    {
        framedemo f1 = new framedemo();


    }
    
}
