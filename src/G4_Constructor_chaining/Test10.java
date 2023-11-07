package G4_Constructor_chaining;

public class Test10 
{
	//constructor chaining
	
		Test10()
		{
			this("Siya");
		}
		Test10(String StudentName)
		{
			this('C');
			System.out.println("Name of student="+StudentName);
		}
		Test10(char StudentGrade)
		{
			this(52.2f);
			System.out.println("Grade="+StudentGrade);
		}
		Test10(float StudentPercentage)
		{
			this(32);
			System.out.println("Percentage="+StudentPercentage+"%");
		}
		Test10(int StudentRollNo)
		{
			System.out.println("Rollnumber="+StudentRollNo);
		}

		public static void main(String[] args) 
		{
			Test10 T10=new Test10();
		}
}
