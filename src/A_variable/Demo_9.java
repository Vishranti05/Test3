package A_variable;

public class Demo_9
{
  public static void main(String[] args)
  {
	  //Step1:variable declaration
	  String StudentName;              //DataType VariableName;
	  int StudentRollNo;               //DataType VariableName;
	  char StudentGrade;               //DataType VariableName;
	  float StudentPercentage;         //DataType VariableName;
	  
	  //Step2:variable initialization
	  StudentName="Vivek";            //VariableName="VariableData";
	  StudentRollNo=15;               //VariableName=VariableData;
	  StudentGrade='C';               //VariableName='VariableData';
	  StudentPercentage=50.50f;       //VariableName=VariableData*f;
	  
	  //step3:variable usage
	  System.out.println("Student Name:-"+StudentName);              //Vivek
	  System.out.println("Student Roll No:-"+StudentRollNo);            //15
	  System.out.println("Student Grade:-"+StudentGrade);             //C
	  System.out.println("Student Percentage:-"+StudentPercentage+"%");        //50.50
  }
}
