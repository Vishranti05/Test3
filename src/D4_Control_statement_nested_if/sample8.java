package D4_Control_statement_nested_if;

public class sample8
{
	public static void main(String[] args) 
	{
		String UN="Boku";
		String PSW="Mau";
		
		if("Boku"==UN)
		{
			System.out.println("Correct Username");
			
			if("Mau"==PSW)
			{
				System.out.println("Correct Password");
			}
			else
			{
				System.out.println("Incorrect Passwowrd:Login failed");
			}
		}
		else
		{
			System.out.println("Incorrect Username:login failed");
		}
		
	}


}
