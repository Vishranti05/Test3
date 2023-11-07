package A_variable;

public class Demo_2 
{
	public static void main(String[] args)
	{
	//step1:variable Declaration
		
		String StudentName; //DataType VariableName;
		int StudentRollNo;  //DataType VariableName;
		char StudentGrade;  //DataType VariableName;
		float StudentPercentage; //DataType VariableName;
		
    // Step2:Variable initialization
		
		StudentName="Vishranti";            //variableName="variableData";
		StudentRollNo=5;                    //variableName=variableData;
		StudentGrade='A';                   //variableName='variableData';
		StudentPercentage=80.90f;           //variableName=variableData*f;
		
		//Step3:Variable usage
		
		System.out.println("Student name:-"+StudentName);    //Vishranti
		System.out.println("Student Roll No:-"+StudentRollNo);  //5
		System.out.println("Student Grade:-"+StudentGrade);   //A
		System.out.println("Student percentage:-"+StudentPercentage+"%"); //80.90
		
		}

}
