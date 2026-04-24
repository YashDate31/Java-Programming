class Studentdemo
{  
    int id;  
    String name; 
	
    Studentdemo()
	{
	System.out.println("I am Default constructor");
	}
      
    Studentdemo(int i,String n)    //creating a parameterized constructor
    {  
    id = i;  
    name = n;  
    }  
    
    void display()
    {
     System.out.println(id+" "+name);
    }  
   
    public static void main(String args[])  
  {  
    Studentdemo s3 = new Studentdemo();
    Studentdemo s1 = new Studentdemo(111,"XYZ");  
    Studentdemo s2 = new Studentdemo(222,"ABC");  
     
    s1.display();  
    s2.display();  
   }  
}  