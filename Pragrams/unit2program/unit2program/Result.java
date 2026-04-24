

class Student
{
	int rno;
	String name;
	int sub1, sub2, sub3;

	void getData(int r, String n, int s1, int s2, int s3)
	{
		rno=r;
		name= n;
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
	}
}

class Result extends Student
{
	int total;
	void calculate()
	{
		total = sub1 + sub2 + sub3;
		System.out.println("rollno : "+rno);
		System.out.println("Name : "+name);	
		System.out.println("Total : "+total);
	}
	
	public static void main(String[] args)
	{
		Result r= new Result();
			r.getData(1,"abc",45,50,60);
			r.calculate();
	}
}