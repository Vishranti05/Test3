package F2_static_global_variable_callfrom_same_class;

public class demo8 
{
	//Static global variable call from same class
		static byte a=111;
		static int c=3874834;
		static long d=934093094l;
		//main method
		public static void main(String[] args)
		{
			//call the variable
			System.out.println(a);          //variableName
			System.out.println(c);          //variableName
			System.out.println(d);          //variableName
			
		}
}
