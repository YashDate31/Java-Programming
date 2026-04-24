class UserDefine extends Exception
{
	UserDefine(String text)
	{
		super(text);
	}
}
class userr
{
public static void main(String args[])
{
	int age = 22;
	try
	{
		if(age>18)
		{
			System.out.println("u can vote");
		}else
		throw new UserDefine("U cant vote");
		
	}
	catch(UserDefine e)
	{
		System.out.println(e);
	}
}
}