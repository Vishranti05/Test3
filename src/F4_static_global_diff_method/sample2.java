package F4_static_global_diff_method;

public class sample2
{
	static String Classname="Velocity";
	
	//main method
	public static void main(String[] args)
	{
		System.out.println(Classname);       //VariableName;
		//call the static method from same class
		m1();
		//step1:create object of same class
		sample2 V1=new sample2();
		//step2:call the non-static method
		V1.m2();
	}
	//static regular method
	public static void m1()
	{
		System.out.println(Classname);        //VraibalName
	}
	//no-static regular method
	public void m2()
	{
		System.out.println(Classname);        //VariableName
	}

}
