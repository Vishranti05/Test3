package F7_nonstatic_global_diff_method;


public class test2 
{
	String Name="Virat";                    //non-static global variable
	//main method
	public static void main(String[] args)
	{
		//create object
		test2 S1=new test2();
		//call the variable
		System.out.println(S1.Name);
		
		//call the static method
		m9();
		//create object
		test2 S4=new test2();
		//call the no-static method
		S4.m8();
	}
	//static method
	public static void m9()
	{
		//create object
		test2 S2=new test2();
		//call the variable
		System.out.println(S2.Name);
	}
	//non-static method
	public void m8()
	{
		//create object
		test2 S3=new test2();
		//call the variable
		System.out.println(S3.Name);
	}

}



