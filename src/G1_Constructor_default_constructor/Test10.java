package G1_Constructor_default_constructor;

public class Test10 
{

	//Default constructor
	//Test10(){}------>default constructor provided by compiler
	
	public void division()
	{
		int a=729;
		int b=9;
		int div=a/b;
		System.out.println(div);
	}
	
	public static void main(String[] args) 
	{
		Test10 T10=new Test10();
		T10.division();
		
	}


}
