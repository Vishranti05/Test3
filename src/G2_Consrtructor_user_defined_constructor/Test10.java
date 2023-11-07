package G2_Consrtructor_user_defined_constructor;

public class Test10 
{
	//User defined constructor example
	
		//StepI-Variable declaration
		int x;
		int y;
		
		//StepII-Variable initialization
		Test10()                     //User-defined constructor
		{
			x=90;
			y=50;
		}
		//StepIII-Usage
		public void multiplication()
		{
			int multi=x*y;
			System.out.println(multi);
		}
		public static void main(String[] args)
		{
			Test10 T10=new Test10();
			T10.multiplication();
			
		}


}
