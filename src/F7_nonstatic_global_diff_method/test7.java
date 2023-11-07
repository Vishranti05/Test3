package F7_nonstatic_global_diff_method;

public class test7 
{
	String Name="Hrishan";                    //non-static global variable
	//main method
	public static void main(String[] args)
	{
		//create object
		test7 T1=new test7();
		//call the variable
		System.out.println(T1.Name);
		
		//call the static method
		m9();
		//create object
		test7 T2=new test7();
		//call the no-static method
		T2.m8();
	}
	//static method
	public static void m9()
	{
		//create object
		test7 S3=new test7();
		//call the variable
		System.out.println(S3.Name);
	}
	//non-static method
	public void m8()
	{
		//create object
		test7 S4=new test7();
		//call the variable
		System.out.println(S4.Name);
	}


}
