package F7_nonstatic_global_diff_method;

public class test4
{
	char b='Z';
	public static void main(String[] args) 
	{
		//create object
		test4 C1=new test4();
		//call the variable
		System.out.println(C1.b);
		
		//call the static method
		m1();
		//call non-static method
		test4 C4=new test4();
		C4.m2();
		
	}
	public static void m1()
	{
		//create object
		test4 C2=new test4();
		//call the variable
		System.out.println(C2.b);
	}
	public void m2()
	{
		//create object
		test4 C3=new test4();
		//call the variable
		System.out.println(C3.b);
	}

}
