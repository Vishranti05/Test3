package G1_Constructor_default_constructor;

public class Test8
{

	//Default constructor
	//Test8(){}------>default constructor provided by compiler
	
	public void division()
	{
		int a=888;
		int b=8;
		int div=a/b;
		System.out.println(div);
	}
	
	public static void main(String[] args) 
	{
		Test8 T8=new Test8();
		T8.division();
		
	}


}
