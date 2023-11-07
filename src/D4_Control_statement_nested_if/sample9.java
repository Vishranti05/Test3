package D4_Control_statement_nested_if;

public class sample9 
{
	public static void main(String[] args) 
	{
		String ID="VS";
		String PSW="SV";
		
		if("VS"==ID)
		{
			System.out.println("Username is correct");
			
			if("SV"==PSW)
			{
				System.out.println("Psswowrd is correct");
			}
			else
			{
				System.out.println("Password is incorrect");
			}
		}
		else
		{
			System.out.println("Username is incorrect");
		}
	}


}
