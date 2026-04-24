class JavaNestedIfExample2
{      
    public static void main(String[] args)
 {      
      
    int age=15;    
    int weight=58; 
     
    
    if(age>=18)
    {      
        if(weight>50)
        {    
            System.out.println("You are eligible to donate blood");    
        } 
        else
        {  
            System.out.println("You are not eligible to donate blood");    
        }  
    } 
   else
    {  
      System.out.println("Age must be greater than 18");  
    }  
 }  
}  