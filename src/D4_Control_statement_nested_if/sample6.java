package D4_Control_statement_nested_if;

public class sample6
{
	public static void main(String[] args)
	{
		String ID="Sanvish";
		String PSW="Vishsan";
		
		if("sanvishu"==ID)
		{
			System.out.println("Correct Username");
			if("vishsan"==PSW)
			{
				System.out.println("Correct password");
			}
			else
			{
				System.out.println("Wrong Password:login failed");
			}
		}
		else
		{
			System.out.println("Wrong Username:login failed");
		}
		
	}


}
