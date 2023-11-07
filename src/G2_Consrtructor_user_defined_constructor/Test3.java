package G2_Consrtructor_user_defined_constructor;

public class Test3 
{
	//step1:variable declaration
	int a;
	int b;
	String c;
	//variable initialization
	Test3()                 //--------->user defined constructor
	{
		a=45;
		b=5;
		c="Answer";
	}
	//usage
	public void m5()
	{
		int div=a/b;
		System.out.println(div);
		System.out.println(c);
	}
	//main method
	public static void main(String[] args) 
	{
		//create object
		Test3 Q1=new Test3();
		//call the method
		Q1.m5();
		
	}

}
