package G2_Consrtructor_user_defined_constructor;

public class Test6 
{
	//User defined constructor example
	
	//StepI-Variable declaration
	int x;
	int y;
	
	//StepII-Variable initialization
	Test6()                     //User-defined constructor
	{
		x=60;
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
		Test6 T6=new Test6();
		T6.multiplication();
		
	}

}
