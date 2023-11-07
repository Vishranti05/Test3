package A_variable;

public class Demo_12 
{
	public static void main(String[] args)
	{
	//step1:variable declaration
		
		String StudentName;                   //DataType variableName;
		int StudentRollNo;                    //DataType variableName;
		char StudentGrade;                    //DataType variableName;
		float StdentPercentage;               //DataType variableName;
		
		//Step2:Variable initialization
		StudentName="Shruti";               //VariableName="VariableData";
		StudentRollNo=25;                   //VariableName=VariableData;
		StudentGrade='A';                   //VariableName='VariableData';
		StdentPercentage=90.90f;            //VariableName=VariableData*f;
		
		//Variable usage
		System.out.println("Student name:"+StudentName);                      //shruti
		System.out.println("Student Rollno:"+StudentRollNo);                  //25
		System.out.println("Stdent grade:"+StudentGrade);                     //A
		System.out.println("Student Percentage:"+StdentPercentage+"%");       //90.90%

		}

}
