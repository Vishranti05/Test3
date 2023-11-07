package D4_Control_statement_nested_if;

public class sample2
{
	public static void main(String[] args)
	{
		String UN="Vishranti";
		String PSW="Asmita";
		
		if("Vishrantii"==UN)
		{
			System.out.println("correct usename");
			
			if("Asmita"==PSW)
			{
				System.out.println("correct password");
			}
			else
			{
				System.out.println("wrong password:login failed");
			}
		}
		else
		{
			System.out.println("wrong Username:login failed");
		}
		
	}


}
