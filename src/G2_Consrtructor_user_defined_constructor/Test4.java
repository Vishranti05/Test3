package G2_Consrtructor_user_defined_constructor;

public class Test4
{
	//User defined constructor
	//Step1:variable declarartion
	int m;
	int n;
	//Step2:variable initialization
	Test4()
	{
	m=45;
	n=60;
	}
	//Step3:usage
	public void substraction()
	{
		int sub=n-m;
		System.out.println(sub);
	}
	//main method
	public static void main(String[] args) 
	{
		//create object of same class
		Test4 T1=new Test4();
		T1.substraction();
	}

}
