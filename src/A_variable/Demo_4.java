package A_variable;

public class Demo_4 
{
	public static void main(String[] args)    //main method
	{
		//Step1:Variable Declaration
		
		String StudentName;                //DataType VariableName
		int StudentRollNo;                 //DataType VariableName
		char StudentGrade;                 //DataType VariableName
		float StudentPercentage;           //DataType VariableName
		
		//Step2:Variable initialization
		
		StudentName="Mangesh";            //VariableNamee="VariableData";
		StudentRollNo=7;                  //VariableNamee=VariableData;
		StudentGrade='A';                 //VariableNamee='VariableData';
		StudentPercentage=72.34f;         //VariableNamee=VariableData*f;
		
		//Step3:Variable Usage
		
		System.out.println("Student name:-"+StudentName);  //Mangesh
		System.out.println("Student Roll No:-"+StudentRollNo); //7
		System.out.println("Student Grade:-"+StudentGrade);  //A
		System.out.println("Student Percentage:-"+StudentPercentage+"%");  //72.34
		
	}

}
