package F4_static_global_diff_method;

public class sample1
{
	//Static global variable call from different methods
	
	static int a=50;                       //static global variable
	
	//main method
	public static void main(String[] args) 
	{
		System.out.println(a);   //variableName
		m1();
		sample1 S1=new sample1();
		S1.m2();
		
	}
	//static regular method
	public static void m1()
	{
		System.out.println(a);              //variableName
	}
	//non-static regular method
	public void m2()
	{
		System.out.println(a);              //variableName
	}

}
