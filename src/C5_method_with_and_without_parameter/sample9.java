package C5_method_with_and_without_parameter;

public class sample9 
{
	public static void main(String[] args)
	{
		
	studentInfo("Swati",25,'a');
	studentInfo("Tanmay",20,'a');
	
		
	}
	//static regular method
	public static void studentInfo(String StudentName, int StudentRollno, char StudentGrade)
	{
		System.out.println("Name of student="+StudentName);
		System.out.println("Roll number of student="+StudentRollno);
		System.out.println("grade of student="+StudentGrade);
	}

}
