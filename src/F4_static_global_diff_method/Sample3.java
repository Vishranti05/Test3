package F4_static_global_diff_method;

public class Sample3
{
	static int marks=90;
	
	//main method
	public static void main(String[] args)
	{
		System.out.println(marks);               //variableName;
		//call the static method
		m1();
		//create object
		Sample3 S1=new Sample3();
		//call the non-static method
		S1.m2();
		
	}
	//static method
	public static void m1()
	{
		System.out.println(marks);             //variableName;
	}
	public void m2()
	{
		System.out.println(marks);              //VariabkeName;
	}

}
