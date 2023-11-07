package D4_Control_statement_nested_if;

public class sample5 
{
	public static void main(String[] args)
	{
		String UN="Asmita";
		String PSW="Mangesh";
		
		if("Asmita"==UN)
		{
			System.out.println("Correct Username");
			
			if("mangesh"==PSW)
			{
				System.out.println("Correct Password");
			}
			else
			{
				System.out.println("Wrong password:login failed");
			}
		}
		else
		{
			System.out.println("Wrong Username:login failed");
		}
		
	}


}
