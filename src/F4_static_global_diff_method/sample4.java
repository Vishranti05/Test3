package F4_static_global_diff_method;

public class sample4 
{
	static String name="Visharnti";
	//main method
	public static void main(String[] args) 
	{
		System.out.println(name);
		//call the static method
		m1();
		//create object
		sample4 V1=new sample4();
		//call non-static method
		V1.m2();
	}
	//static method
	public static void m1()
	{
		System.out.println(name);
	}
	//non-static method
	public void m2()
	{
		System.out.println(name);
	}

}
