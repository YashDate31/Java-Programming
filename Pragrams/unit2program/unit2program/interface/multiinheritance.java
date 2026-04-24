class student
{
int rollnumber;
void getnumber(int n)
{
rollnumber=n;
}
void putnumber()
{
System.out.println("rollno:"+rollnumber);
}
}
 class test extends student
{
float part1,part2;
void getmarks(float m1,float m2)
{
part1=m1;
part2=m2;
}
void putmark()
{
System.out.println("marks obtained");
System.out.println("part1:"+part1);
System.out.println("part2:"+part2);
}
}
interface sports
{
float sportwt=6.0f;
void putwt();
}
class results extends test implements sports
{
float total;
 void putwt()
{
System.out.println("sports wt:"+sportwt);
}
void display()
{
total=part1+part2+sportwt;
System.out.println("total score:"+total);
}
}
class multiinheritance
{
public static void main(String args[])
{
results r1=new results();
r1.getnumber(101);
r1.getmarks(18.4f,15.7f);
r1.putnumber();
r1.putmark();
r1.putwt();
r1.display();
}
}
