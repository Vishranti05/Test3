package A_variable;

public class Demo_11
{
	public static void main(String[] args)  
	{
	//Step1:Variable declaration
		String TeacherName;                   //DataType VariableName;
		int TeacherId;                        //DataType VariableName;
		char TeacherGrade;                    //DataType VariableName;
		float TeacherIncrement;               //DataType VariableName;
		
		//step2:Variable initialization
		TeacherName="Virat";                //VariableName="VariableIndormation/Data";
		TeacherId=15;                       //VariableName=VariableIndormation/Data;
		TeacherGrade='A';                   //VariableName='VariableIndormation/Data';
		TeacherIncrement=30.2f;             //VariableName=VariableIndormation/Data*f;
		
		//step3:Variable usage
		System.out.println("Teacher name:"+TeacherName);      //Virat
		System.out.println("Teacher Id:"+TeacherId);          //15
		System.out.println("Teacher Grade:"+TeacherGrade);    //A
		System.out.println("Teacher Increment:"+TeacherIncrement+"%");  //30.2
	}

}
