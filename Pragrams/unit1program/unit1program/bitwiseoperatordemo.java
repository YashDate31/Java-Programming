class bitwiseoperatordemo 
{
    public static void main(String[] args)
    {
        
        int a = 2;
        int b = 7;
 
        // bitwise and
        
        System.out.println("a&b = " + (a & b));
 
        // bitwise or
        
        System.out.println("a|b = " + (a | b));
 
        // bitwise xor
        
        System.out.println("a^b = " + (a ^ b));
 
        // bitwise not
        
        // will give 2's complement of 1010 = -6

        System.out.println("~a = " + ~a);
 
         // left shift operator
        
        System.out.println("a<<2 = " + (a << 2));
 
       // right shift operator
        
        System.out.println("a>>1 = " + (a >> 1));
 
       
    }
}