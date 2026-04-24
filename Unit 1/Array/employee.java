import java.util.*;


    class employee
    {
        int empid;
        String ename;
        int salary;

        void accept()
        {
            System.err.println("Enter the data of employee: ");
            Scanner sc = new Scanner(System.in);

            System.err.println("Enter the name: ");
            ename = sc.next();
            System.err.println("Enter the empid: ");
            empid = sc.nextInt();

            System.err.println("Enter the Salary: ");
            salary = sc.nextInt();

        }

        void display()
        {
            System.err.println("Name:= "+ename);
            System.err.println("ID= "+empid);
            System.err.println("Salary:= "+ salary);
        }
    
    public static void main(String args[])
    {
        employee e[] = new employee[2];

        // for loop to allocate memory location

        for(int i=0;i<2;i++)
        {
            e[i]= new employee();
        }

        //accept

        for(int i=0;i<2;i++)
        {
            e[i].accept();
        }

        //display
        System.err.println("Enter the data of 2 employee: ");

        for(int i=0;i<2;i++)
        {
            e[i].display();
        }



    }
}


