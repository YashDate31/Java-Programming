class stringdemo 
{

   public static void main(String args[]) 
 {
// calculating String Length

	  String s = "gp";

      int len = s.length();
      System.out.println( "String Length is : " + len );


      s = s.concat(" Awasari");
      System.out.println("concat: "+ s);

//char at any position
      char result = s.charAt(3);
      System.out.println("charAt: "+ result);

//substring
	System.out.println(s.substring(3));
	System.out.println(s.substring(3,8));

// indexOf   
    System.out.println("indexOf h: " +s.indexOf('w'));
	System.out.println("indexOf a: " +s.indexOf('a',6));
	System.out.println("lastindexOf a: " +s.lastIndexOf('a'));
	
//replace
	System.out.println("replace a by z: " +s.replace('a','z'));

 
	
	
	System.out.println("Uppercase: "+s.toUpperCase()); 
	}
}