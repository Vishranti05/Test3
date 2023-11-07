package G4_Constructor_chaining;

public class Test3 
{
	//constructor chaining
	
	Test3()
	{
		this("vikrant");
	}
	
	Test3(String Employee)
	{
		this('B');
		System.out.println("Employee name:-"+Employee);
	}
	
	Test3(char Grade)
	{
		this(5.2f);
		System.out.println("Employee grade:-"+Grade);
	}
	
	Test3(float increment)
	{
		this(25000);
		System.out.println("Salary increment:-"+increment+"%");
	}
	Test3(int Salary)
	{
		System.out.println("Monthly Salary:-"+Salary);
	}
	
	public static void main(String[] args)
	{
		Test3 T3=new Test3();
	}

}
