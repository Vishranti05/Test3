package F4_static_global_diff_method;

public class sample5 
{
	//Static global variable call from different methods
	
		static int z=100;                       //static global variable
		
		//main method
		public static void main(String[] args) 
		{
			System.out.println(z);   //variableName;
			m1();
			sample5 S5=new sample5();
			S5.m2();
			
		}
		//static regular method
		public static void m1()
		{
			System.out.println(z);              //variableName
		}
		//non-static regular method
		public void m2()
		{
			System.out.println(z);              //variableName
		}


}
