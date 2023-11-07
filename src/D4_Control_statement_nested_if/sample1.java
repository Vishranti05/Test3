package D4_Control_statement_nested_if;

public class sample1 
{
	public static void main(String[] args)
	{
		String UN="abc";
		String PSW="xyz";
		
		if("abc"==UN)                              //abc=abc---->true
		{
			System.out.println("User name is correct");
			
			if("xyz"==PSW)                          //xyz=xyz--------->true
			{
				System.out.println("Password is correct");
			}
			else
			{
				System.out.println("Password is wrong:login failed");
			}
		}
		else
		{
			System.out.println("User name is wrong:Login failed");
		}
		
	}


}
