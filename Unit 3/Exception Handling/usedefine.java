//Write  a  program  to  accept  age  from  user  and  throw  an   exception  if  age  is  less  than  18
class age extends Exception
{
    age(String msg)
    {
        super(msg);
    }
}
public class usedefine {
    void check()
    {
        int age =1114;

        try{
            if(age<18)
            {
                throw new age("U can't vote");
            }
            else 
            {
                throw new age("U can vote");
            }
        }
        catch(age a1)
        {
            System.out.println(a1);
        }
        

    }

    public static void main(String args[])
    {
        usedefine u1= new usedefine();
        u1.check();
    }
    
}
