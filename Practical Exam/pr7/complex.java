class Complex
{
    int real;
    int img;

    Complex()
    {
        real = 30;
        img = 40;
    }

    Complex(int i, int j)
    {
        real = i;
        img = j;
    }

    void display()
    {
        System.out.println(real + " + " + img + "i");
    }

    Complex add(Complex c)
    {
        Complex temp = new Complex();

        temp.real = this.real + c.real;
        temp.img  = this.img + c.img;

        return temp;
    }

    public static void main(String args[])
    {
        Complex c1 = new Complex();
        Complex c2 = new Complex(10,20);

        Complex c3 = c1.add(c2);
        c3.display();
    }
}