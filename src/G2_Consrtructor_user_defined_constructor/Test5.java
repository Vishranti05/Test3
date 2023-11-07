package G2_Consrtructor_user_defined_constructor;

public class Test5
{
	//user defined constructor
	//step1:variable declaration
	int c;
	int d;
	String Myname;
	//Step2:variable initialization
	Test5()
	{
		c=100;
		d=5;
		Myname="Vishu";
	}
	//Step3:usage
	public void division()
	{
		int div=c/d;
		System.out.println(div);
	}
	public void Name()
	{
		System.out.println(Myname);
	}
	//main method
	public static void main(String[] args)
	{
		//create object 
		Test5 S1=new Test5();
		S1.division();
		S1.Name();
		
		
	}

}
