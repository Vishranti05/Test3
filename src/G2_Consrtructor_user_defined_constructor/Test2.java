package G2_Consrtructor_user_defined_constructor;

public class Test2 
{
	//step1:variable declaration
	int v;
	int s;
	//step2:variable initialization
	Test2()                         //------------>user defined constructor
	{
		v=100;
		s=100;
	}
	//step3:usage
	public void addition()
	{
		int sum=v+s;
		System.out.println(sum);
	}
	//main method
	public static void main(String[] args) 
	{
		//create object
		Test2 j1=new Test2();
		//call the method
		j1.addition();
		
		
	}

}
