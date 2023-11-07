package G4_Constructor_chaining;

public class Test8
{
	//constructor chaining
	
		Test8()
		{
			this("Atharva");
		}
		Test8(String StudentName)
		{
			this('A');
			System.out.println("Name of student="+StudentName);
		}
		Test8(char StudentGrade)
		{
			this(97.2f);
			System.out.println("Grade="+StudentGrade);
		}
		Test8(float StudentPercentage)
		{
			this(1);
			System.out.println("Percentage="+StudentPercentage+"%");
		}
		Test8(int StudentRollNo)
		{
			System.out.println("Rollnumber="+StudentRollNo);
		}

		public static void main(String[] args) 
		{
			Test8 T8=new Test8();
		}

}
