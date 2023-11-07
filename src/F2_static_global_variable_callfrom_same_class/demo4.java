package F2_static_global_variable_callfrom_same_class;

public class demo4 
{
	//Static global variable call from same class
	static byte a=10;
	static short b=5000;
	static int c=666666;
	static long d=7457465846l;
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
