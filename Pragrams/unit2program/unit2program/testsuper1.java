class Personbase
{  
   int id;  
    
	Personbase(int i)
	{  
		id=i;  
	  
	}  
} 
class Person extends Personbase
{  
     
   String name;
  
	Person(int x,String n)
	{  
		 
		super(x);  
		name=n; 
                System.out.println("id:" +id);
                System.out.println("Name:" +name); 
	}  
}   

class testsuper1
{  
public static void main(String[] args)
{  
Person p1=new Person(1,"abc");  
  
}
}  