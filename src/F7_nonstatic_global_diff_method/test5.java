package F7_nonstatic_global_diff_method;

public class test5 
{
	int a=400;                                //Non-static global variable

	//main method
	public static void main(String[] args)
	{
		//step1:create object of same class
		test5 V1=new test5();                  //className objectName=new className();
		//step2:call the variable
		System.out.println(V1.a);              //objectName.variableName;
		
		m1();
		
		test5 V2=new test5();
		V2.m2();
		
	}
	//static regular method
	public static void m1()
	{
		//step1:create object of same class
		test5 V2=new test5();                  //className objectName=new className();
		//step2:call the variable
		System.out.println(V2.a);              //objectName.variableName;
	}
	//non-static regular method
	public void m2()
	{
		System.out.println(a);               //variableName
	}


}
