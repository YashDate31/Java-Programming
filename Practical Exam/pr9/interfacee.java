/*Requirements:
Create a class Person with method showName()
Create an interface Student with method showMarks()
Create a class Result that:
extends Person
implements Student
Display name and marks*/

class person
{
	String name = "Yash";
	void showName()
	{
	System.out.println(name);
	}
	
}
interface student 
{	final int marks= 99;
	 abstract void showMarks();
}
class result extends person implements student{
	public void showMarks()
	{System.out.println(marks);
	}
	}
	
class interfacee
{
	public static void main(String args[])
	{
	result r1= new result();
	r1.showMarks();
	r1.showName();
}}