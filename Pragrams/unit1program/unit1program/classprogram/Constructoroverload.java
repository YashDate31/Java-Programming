class Employeedemo
{
    
    Employeedemo(String name)
    {
        System.out.println("Constructor with one argument - String : " + name);
    }
  
    
    Employeedemo(String name, int age)
    {
  
        System.out.println("Constructor with two arguments - String and Integer : " + name + " "+ age);
  
    }
  
    
    Employeedemo(long id)
    {
        System.out.println("Constructor with one argument - Long : " + id);
    }
}
  
class Constructoroverload
{
    public static void main(String[] args)
    {
Employeedemo e2 = new Employeedemo("Dharmesh", 26);  // Invoke the constructor with two arguments
          
Employeedemo e3 = new Employeedemo(325614567); // Invoke the constructor with one argument of type 'Long'
        
        Employeedemo e1 = new Employeedemo("Shikhar"); //Invoke the constructor with one argument of type 'string'
  
        
        
        
        
          
    }
}