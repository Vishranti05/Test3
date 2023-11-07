package A_variable;

public class Demo_8 
{
	public static void main(String[] args)  //main method
	{
	//Step1:variable declaration
		String StudentName;             //DataType VariableName;
		int StudentRollNo;              //DataType VariableName;
		char StudentGrade;              //DataType VariableName;
		float StudentPercentage;        //DataType VariableName;
		
		//Step2:Variable initialization
		StudentName="Ishwari";        //VariableName="VariableData";
		StudentRollNo=18;             //VariableName=VariableData;
		StudentGrade='A';            //VariableName='VariableData';
		StudentPercentage=90.11f;    //VariableName=VariableData*f;
		
		//Step3:variable usage
		System.out.println("Student Nmae:-"+StudentName);            //Ishwari
		System.out.println("Student Roll No:-"+StudentRollNo);          //18
		System.out.println("Student grade:-"+StudentGrade);           //A
        System.out.println("Student Percentage:-"+StudentPercentage+"%");      //90.11
		
		
	}

}
