package D3_Control_statement_else_if;

public class test9
{
	public static void main(String[] args)
	{
		int marks=95;
		if(marks>=65)
		{
			System.out.println("Distinction");
		}
		else if(marks>=60)
		{
			System.out.println("First class");
		}
		else if(marks>=55)
		{
			System.out.println("Higher second class");
		}
		else if(marks>=50)
		{
			System.out.println("Second class");
		}
		else if(marks>=35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}



}
