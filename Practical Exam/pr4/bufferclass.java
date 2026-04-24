class bufferclass
{
	public static void main(String args[])
	{
		StringBuffer s = new StringBuffer("Yash");
		s.append(" date");
		System.out.println(s);
		s.insert(4," V ");		
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.capacity());
		System.out.println(s.reverse());



	}

}
