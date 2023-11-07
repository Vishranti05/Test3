package D4_Control_statement_nested_if;

public class sample10 
{
	public static void main(String[] args)
	{
		String UN="Sunanda";
		String PSW="Bebi";
		
		if("Sunanda"==UN)
		{
			System.out.println("Username is correct");
			if("Baby"==PSW)
			{
				System.out.println("Password is correct");
			}
			else
			{
			   System.out.println("Passwowrd is incorrect")	;
			}
		}
		else
		{
			System.out.println("Username is incorrect");
		}
	}


}
