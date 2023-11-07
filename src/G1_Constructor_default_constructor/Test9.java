package G1_Constructor_default_constructor;

public class Test9 
{
	      //Default constructor
		// Test9(){}----------------->Default constructor provided by compiler
		
		public void multiplication()
		{
			int x=44;
			int y=12;
			int multi=x*y;
			System.out.println(multi);
		}
		
		public static void main(String[] args)
		{
			Test9 T9=new Test9();
			T9.multiplication();
			
		}


}
