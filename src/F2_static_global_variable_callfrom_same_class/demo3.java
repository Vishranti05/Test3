package F2_static_global_variable_callfrom_same_class;

public class demo3 
{
	//static global variable call from same class
	static String Studentname="Vishranti";
	static int RollNo=5;
	static char Grade='A';
	
	//main method
	public static void main(String[] args) 
	{
		//call the variable
		System.out.println("name of student="+Studentname);        //variableName;
		System.out.println("Rollnumber="+RollNo);             //variableName;
		System.out.println("Grad="+Grade);              //variableName;
	}

}
