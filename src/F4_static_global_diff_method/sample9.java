package F4_static_global_diff_method;

public class sample9 
{

	//Static global variable call from different methods
	
		static int c=555;                       //static global variable
		
		//main method
		public static void main(String[] args) 
		{
			System.out.println(c);   //variableName;
			m1();
			sample9 S9=new sample9();
			S9.m2();
			
		}
		//static regular method
		public static void m1()
		{
			System.out.println(c);              //variableName
		}
		//non-static regular method
		public void m2()
		{
			System.out.println(c);              //variableName
		}



}
