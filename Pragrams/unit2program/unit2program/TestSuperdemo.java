
class Person 
{ 
	void message() 
	{ 
		System.out.println("This is person class"); 
	} 
} 

class Student extends Person 
{ 
	void message() 
	{ 
	
		super.message();   // this calls overridden method
		System.out.println("This is student class"); 
	} 

	
} 


class TestSuperdemo 
{ 
	public static void main(String args[]) 
	{ 
		Student s = new Student(); 

		
		s.message();   // this calls overriding method
	} 
} 
