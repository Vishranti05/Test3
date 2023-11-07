package D4_Control_statement_nested_if;

public class sample4
{
	public static void main(String[] args)
	{
		String UN="Swati";
		String PSW="Tanmay";
		
		if("Swatii"==UN)
		{
			System.out.println("Correct UN");
			if("tanmay"==PSW)
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
			System.out.println("Wrong UN:login failed");
		}
	}


}
