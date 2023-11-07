package G1_Constructor_default_constructor;

public class Test3 
{
	//Default constructor
	// Test3(){}----------------->Default constructor provided by compiler
	
	public void multiplication()
	{
		int x=50;
		int y=55;
		int multi=x*y;
		System.out.println(multi);
	}
	
	public static void main(String[] args)
	{
		Test3 T3=new Test3();
		T3.multiplication();
		
	}

}
