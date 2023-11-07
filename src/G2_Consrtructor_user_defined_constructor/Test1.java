package G2_Consrtructor_user_defined_constructor;

public class Test1 
{
	//step1:variable declaration
	int a;
	int b;
   //Step2:variable initialization
	Test1()                               //user defined constructed
	{
		a=25;
		b=50;
	}
	//Step3:Usage
	public void addition()
	{
		int sum1=a+b;
		System.out.println(sum1);
	}
	public static void main(String[] args)
	{
		//create object
		Test1 T1=new Test1();
		//call the method
		T1.addition();
	}

}
