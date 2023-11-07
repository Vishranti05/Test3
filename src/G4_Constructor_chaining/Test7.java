package G4_Constructor_chaining;

public class Test7 
{
	//constructor chaining
	
		Test7()
		{
			this("Yashwant");
		}
		
		Test7(String Employee)
		{
			this('A');
			System.out.println("Employee name:-"+Employee);
		}
		
		Test7(char Grade)
		{
			this(30.2f);
			System.out.println("Employee grade:-"+Grade);
		}
		
		Test7(float increment)
		{
			this(150000);
			System.out.println("Salary increment:-"+increment+"%");
		}
		Test7(int Salary)
		{
			System.out.println("Monthly Salary:-"+Salary);
		}
		
		public static void main(String[] args)
		{
			Test7 T7=new Test7();
		}


}
