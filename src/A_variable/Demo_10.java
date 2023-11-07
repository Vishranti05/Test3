package A_variable;

public class Demo_10 
{
	public static void main(String[] args)
	{
	//Step1:Variable Declaration
		String StudentName;             //DataType VariableName;
		int StudentRollNo;              //DataType VariableName;
		char StudentGrade;              //DataType VariableName;
		float StudentPercentage;        //DataType VariableName;
		
		//Step2:variable initialization
		StudentName="Ovi";            //VariableName="VariableData";
		StudentRollNo=4;              //VariableName=VariableData;
		StudentGrade='B';             //VariableName='VariableData';
		StudentPercentage=100f;       //VariableName=VariableData*f;
		
		//Step3:variable usage
		System.out.println("Student name:-"+StudentName);          //Ovi
		System.out.println("Student Roll No:-"+StudentRollNo);        //100
		System.out.println("Student Grade:-"+StudentGrade);         //Z
		System.out.println("Student Percentage:-"+StudentPercentage+"%");    //100
	}

}
