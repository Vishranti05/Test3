package F2_static_global_variable_callfrom_same_class;

public class demo10 
{
	//Static global variable call from same class
	
	static char c='S';
	static String d="Static variable";
	
	public static void main(String[] args)
	{
		System.out.println(c);          //variableName;
		System.out.println(d);          //variableName;
		
	}

}
