package G1_Constructor_default_constructor;

public class Test2 
{
	//Default constructor provided by compiler
	//Test2(){}------------------------->Default constructor
	
	public static void main(String[] args) 
	{
		//create object of same class
		Test2 obj1=new Test2();
		//call the method
		obj1.division();
		
	}
	public void division()
	{
		int a=114;
		int b=19;
		int div=a/b;
		System.out.println(div);
	}

}
