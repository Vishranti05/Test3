package A_variable;

public class Demo_7 
{
	public static void main(String[] args)  
	{
		//Step1:variable declaration
		String EmployeeName;          //DataType VariableName;
		int EmployeeId;                //DataType VariableName;
		char EmployeeGrade;           //DataType VariableName;
		float EmployeePercentage;      //DataType VariableName;
		
		//Step2:variable initialization
		EmployeeName="Aarohi";        //VariableName="VariableData";
		EmployeeId=55;                //VariableName=VariableData;
		EmployeeGrade='A';           //VariableName='VariableData';
		EmployeePercentage=99.99f;   //VariableName=VariableData*f;
		
		//step3:variable usage
		System.out.println("Employee name:-"+EmployeeName);  //Aarohi
		System.out.println("Employee Id:-"+EmployeeId);  //55
		System.out.println("Employee Grade:-"+EmployeeGrade); //C
		System.out.println("Employee Percentage:-"+EmployeePercentage+"%");  //45.45
		
	}

}
