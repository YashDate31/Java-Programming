class StringBufferDemo 
{

   public static void main(String args[]) 
 {
// calculating String Length

	  StringBuffer s = new StringBuffer("gp awasari");
     
      System.out.println( "String Length is : " + s.length());
      System.out.println( "String capacity is : " + s.capacity());

//append Strings
      s = s.append(" (khurd)");
      System.out.println("aapend: "+ s);


//setcharAt
	s.setCharAt(0, 'G');
	System.out.println("setcharAt: "+ s);
	
//delete	
	System.out.println("delete: " + s.delete(3,8));
	
//insert	
	System.out.println("insert: " +s.insert(3,"java"));
//replace
	System.out.println("replace: " +s.replace(3,8,"Shiva"));
//reverse
	System.out.println("reverse: " +s.reverse());

	}
}