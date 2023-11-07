package F2_static_global_variable_callfrom_same_class;

public class demo2
{
	// Static Global Variable Call from Same Class
	static int a=25;
	static float b=25.45f;
	static char c='Z';
	static String d="velocity";
	
	//main method
	public static void main(String[] args) 
	{
		//call the variable
		System.out.println(a);          //variableName
		System.out.println(b);          //variableName
		System.out.println(c);          //variableName
		System.out.println(d);          //variableName
		
	}

}
