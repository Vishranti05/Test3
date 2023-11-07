package G1_Constructor_default_constructor;

public class Test7 
{
	//Default constructor
		// Test7(){}----------------->Default constructor provided by compiler
		
		public void multiplication()
		{
			int x=30;
			int y=55;
			int multi=x*y;
			System.out.println(multi);
		}
		
		public static void main(String[] args)
		{
			Test7 T7=new Test7();
			T7.multiplication();
			
		}

}
