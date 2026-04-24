
//Develop and Interest Interface which contains Simple Interest and Compound Interest methods 
//and static final field of rate 25%. Write a class to implement those methods

interface  Interest
{
    public static final float rate = 0.25f;
    public abstract void simple_interest();
    public abstract void compound_interest();
}

class Calculate1 implements Interest
{
    public void simple_interest()
    {
        int si = (int)(2000*2*rate);
        System.out.println("Simple interest is:- "+ si);
    }
    public void compound_interest()
    {
        int ci = (int)(2000*rate/2);
        System.out.println("compound:--"+ ci);
    }

}


public class interfaceeee {
    public static void main(String[] args) {
        
            Calculate1 c1 = new Calculate1();
            c1.simple_interest();
            c1.compound_interest();
            

    }


    
    
}
