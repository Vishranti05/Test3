package F4_static_global_diff_method;

public class sample6 
{
	//Static global variable call from different methods
	
		static int a=500;                       //static global variable
		
		//main method
		public static void main(String[] args) 
		{
			System.out.println(a);   //variableName
			m6();
			sample6 S6=new sample6();
			S6.m5();
			
		}
		//static regular method
		public static void m6()
		{
			System.out.println(a);              //variableName
		}
		//non-static regular method
		public void m5()
		{
			System.out.println(a);              //variableName
		}


}
