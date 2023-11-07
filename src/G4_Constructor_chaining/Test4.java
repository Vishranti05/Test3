package G4_Constructor_chaining;

public class Test4
{
	//constructor chaining
	
	Test4()
	{
		this("Aarohi");
	}
	Test4(String StudentName)
	{
		this('A');
		System.out.println("Name of student="+StudentName);
	}
	Test4(char StudentGrade)
	{
		this(95.2f);
		System.out.println("Grade="+StudentGrade);
	}
	Test4(float StudentPercentage)
	{
		this(4);
		System.out.println("Percentage="+StudentPercentage+"%");
	}
	Test4(int StudentRollNo)
	{
		System.out.println("Rollnumber="+StudentRollNo);
	}

	public static void main(String[] args) 
	{
		Test4 T4=new Test4();
	}
}
