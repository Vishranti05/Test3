package G2_Consrtructor_user_defined_constructor;

public class Test9 
{
	//User defined constructor
	//Step1:variable declaration
	int m;
	int n;
	//Step2:variable initialization
	Test9()
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
		Test9 T9=new Test9();
		T9.substraction();
	}


}
