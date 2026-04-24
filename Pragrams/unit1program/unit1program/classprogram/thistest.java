class thistest
{
 int a,b;

 thistest(int a,int b)
{
this.a=a;
this.b=b;
}
void display()
{
System.out.println(a+" "+b);
}

 public static void main(String args[])
 {
  thistest t1=new thistest(5,10);
  t1.display();
 }
}
