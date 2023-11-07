package D4_Control_statement_nested_if;

public class sample7 
{
	public static void main(String[] args) 
	{
		String UN="Lakshmi";
		String PSW="Vasant";
		if("Lakshmi"==UN)
		{
			System.out.println("Correct Username");
			
			if("Vasant"==PSW)
			{
				System.out.println("Correct Password");
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
