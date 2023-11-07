package F2_static_global_variable_callfrom_same_class;

public class demo5
{
	static byte a=111;                           //static global variable
	static short b=4567;                         //static global variable
	static int c=27928283;                       //static global variable
	static long d=2839809890l;                //static global variable
	
	public static void main(String[] args)
	{
		System.out.println(a);                  //variableName;
		System.out.println(b);                  //variableName;
		System.out.println(c);                  //variableName;
		System.out.println(d);                  //variableName;
	}
	

}
