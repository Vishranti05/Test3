package F7_nonstatic_global_diff_method;

public class test6 
{
	byte a=127;                                //Non-static global variable

	//main method
	public static void main(String[] args)
	{
		//step1:create object of same class
		test6 T6=new test6();                  //className objectName=new className();
		//step2:call the variable
		System.out.println(T6.a);              //objectName.variableName;
		
		m1();
		
		test6 T2=new test6();
		T2.m2();
		
	}
	//static regular method
	public static void m1()
	{
		//step1:create object of same class
		test6 V2=new test6();                  //className objectName=new className();
		//step2:call the variable
		System.out.println(V2.a);              //objectName.variableName;
	}
	//non-static regular method
	public void m2()
	{
		System.out.println(a);               //variableName
	}


}
