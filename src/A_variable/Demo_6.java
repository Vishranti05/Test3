package A_variable;

public class Demo_6 
{
	public static void main(String[] args)  //main method
	{
		//Step1:Variable declaration
		String StudentName;      //DataType VariableName;
		int StudentRollNo;       //DataType VariableName;
		char StudentGrade;       //DataType VariableName;
		float StudentPercentage;  //DataType VariableName;
		
		//Step2:variable initialization
		StudentName="Tanmay";     //VariableName="VariableInforamnation";
		StudentRollNo=2;          //VariableName=VariableInforamnation;
		StudentGrade='B';         //VariableName='VariableInforamnation';
		StudentPercentage=65.22f;  //VariableName=VariableInforamnation*f;
		
		//Step3:variable usage
		System.out.println("Student Name:-"+StudentName);    //Tanmay
		System.out.println("Student Roll No:-"+StudentRollNo);  //2
		System.out.println("Stuident Grade:-"+StudentGrade);  //B
		System.out.println("Student Percentage:-"+StudentPercentage+"%");//65.22
		
	}

}
