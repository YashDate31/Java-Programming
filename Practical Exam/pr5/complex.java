class complex
{
	int real;
	int img;
	complex()
	{
	real = 30;
	img = 40;
	}
	complex(int i,int j)
	{
	real = i;
	img = j;
	}
	void display()
	{
		System.out.println(real +" +" + img +"i")
	}
	complex add(complex c)
	{
		complex temp;
		temp.real = c.real + real;
		temp.img = c.img + img;
		return temp;
	}
	public static void main(String args[])
	{
		complex c = new complex();
		complex c2 = new complex(10,20);
		complex c3 = c.add(c2);
		c3.display();
	}
}
