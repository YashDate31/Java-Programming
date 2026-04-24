import java.util.*;

interface gross
{
final int ta=3000,da=2000;
void gross_sal();
}

class employee
{
int basic;
String name;
Scanner sc=new Scanner(System.in);
void basic_sal()
{
System.out.println("Enter name of employee:");
name=sc.next();
System.out.println("Enter basic salary of employee:");
basic=sc.nextInt();
}
}

class salary extends employee implements gross
{
int gross;
 public void gross_sal()
{
gross=basic+ta+da;
}

void disp_sal()
{
System.out.println("name:"+name+"\tgross:"+gross);
}
}

class multipleinheritancedemo
{
public static void main(String args[])
{
 salary s=new salary();
 s.basic_sal();
 s.gross_sal();
 s.disp_sal();
}
}
