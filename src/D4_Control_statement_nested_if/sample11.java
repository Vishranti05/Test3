package D4_Control_statement_nested_if;

public class sample11 
{
	public static void main(String[] args)
	{
	String Loginid="Asmita";
	String Password="asmi123";
	
	if("Asmita"==Loginid)
	{
		System.out.println("Correct Loginid");
		
		if("asmi123"==Password)
		{
			System.out.println("correct passwoprd:logged in ");
		}
		else
		{
			System.out.println("incorrect password:login failed");
		}
	}
	else
	{
		System.out.println("Incorrect Loginid");
	}
	
	
	}
}
