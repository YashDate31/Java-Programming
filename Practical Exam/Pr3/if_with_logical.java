class if_with_logical
{
    public static void main(String args[])
    {
        int a= 5;
        int b = 12;
        int c= 18;
        if (a>b && a>c)
        {
            System.out.println("A is larger");
        }
        else if(b>a && b>c)
        {
            System.out.println("B is larger");

        }
        else{
            System.out.println("C is larger");
        }
    }

}
