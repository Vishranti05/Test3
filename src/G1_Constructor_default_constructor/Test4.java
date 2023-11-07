package G1_Constructor_default_constructor;

public class Test4 
{
	//Default constructor
	//Test4(){}------>default constructor provided by compiler
	
	public void division()
	{
		int a=777;
		int b=7;
		int div=a/b;
		System.out.println(div);
	}
	
	public static void main(String[] args) 
	{
		Test4 T4=new Test4();
		T4.division();
		
	}

}
