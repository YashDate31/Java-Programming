class equalsexample
{  
    public static void main(String args[])
    {  
	String s1="java";  
	String s2="java";  
	String s3="JAVA";  
	String s4="python";  
	System.out.println(s1.equals(s2));//true because content and case is same  
	System.out.println(s1.equals(s3));//false because case is not same  
	System.out.println(s1.equals(s4));//false because content is not same  

//equalsIgnoreCase() method example
	 
	System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same  
	System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored  
	System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same  
    
 //valueOf() method example
  
int value=30;  
String so1=String.valueOf(value);  
System.out.println(so1+10);//concatenating string with 10 

}

}