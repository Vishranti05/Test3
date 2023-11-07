package F7_nonstatic_global_diff_method;

public class test9 
{
	char b='V';
	public static void main(String[] args) 
	{
		//create object
		test9 C1=new test9();
		//call the variable
		System.out.println(C1.b);
		
		//call the static method
		m1();
		//call non-static method
		test9 C4=new test9();
		C4.m2();
		
	}
	public static void m1()
	{
		//create object
		test9 C2=new test9();
		//call the variable
		System.out.println(C2.b);
	}
	public void m2()
	{
		//create object
		test9 C3=new test9();
		//call the variable
		System.out.println(C3.b);
	}


}
