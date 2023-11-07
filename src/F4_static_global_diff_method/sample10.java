package F4_static_global_diff_method;

public class sample10 
{
	static String Schoolname="New English School";
	//main method
	public static void main(String[] args) 
	{
		System.out.println(Schoolname);
		//call the static method
		m1();
		//create object
		sample10 S10=new sample10();
		//call non-static method
		S10.m2();
	}
		//static method
		public static void m1()
		{
			System.out.println(Schoolname);
		}
		//non-static method
		public void m2()
		{
			System.out.println(Schoolname);
		}



}
