class a
{
        void add()
        {
            int a = 10;
            int b=20;
            System.out.println("sUM ="+ (a+b));
        }

        void add(int a)
        {
            int b= 50;
            System.out.println("sUM ="+ (a+b));

        }

        void add(int a,int b)
        {
            System.out.println("sUM ="+ (a+b));
        }

 }
    public static void main(String args[])
    {
        a a1 =new a();
        a1.add();
        a1.add(23);
        a1.add(10,20);
        
    }
        
    

