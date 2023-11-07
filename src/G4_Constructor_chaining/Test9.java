package G4_Constructor_chaining;

public class Test9 
{
	//constructor chaining
	
		Test9()
		{
			this("Ram");
		}
		
		Test9(String Employee)
		{
			this('C');
			System.out.println("Employee name:-"+Employee);
		}
		
		Test9(char Grade)
		{
			this(5.2f);
			System.out.println("Employee grade:-"+Grade);
		}
		
		Test9(float increment)
		{
			this(55000);
			System.out.println("Salary increment:-"+increment+"%");
		}
		Test9(int Salary)
		{
			System.out.println("Monthly Salary:-"+Salary);
		}
		
		public static void main(String[] args)
		{
			Test9 T9=new Test9();
		}

}
