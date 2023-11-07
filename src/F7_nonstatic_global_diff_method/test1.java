package F7_nonstatic_global_diff_method;

public class test1 
{
	int a=40;                                //Non-static global variable

	//main method
	public static void main(String[] args)
	{
		//step1:create object of same class
		test1 V1=new test1();                  //className objectName=new className();
		//step2:call the variable
		System.out.println(V1.a);              //objectName.variableName;
		
		m1();
		
		test1 V2=new test1();
		V2.m2();
		
	}
	//static regular method
	public static void m1()
	{
		//step1:create object of same class
		test1 V2=new test1();                  //className objectName=new className();
		//step2:call the variable
		System.out.println(V2.a);              //objectName.variableName;
	}
	//non-static regular method
	public void m2()
	{
		System.out.println(a);               //variableName
	}

}
