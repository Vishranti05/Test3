package D4_Control_statement_nested_if;

public class sample3 
{
	public static void main(String[] args)
	{
		String loginID="vishu@123";
		String PSW="abc@123";
		
		if("vishu@123"==loginID)                             //vishu@123=vishu@123---->true
		{
			System.out.println("Correct loginId");
			
			if("abcd@123"==PSW)                            //false
			{
				System.out.println("Correct password");
			}
			else
			{
				System.out.println("Wrong password:login failed");
			}
		}
		else
		{
			System.out.println("Wrong loginId:login failed");
		}
	}


}
