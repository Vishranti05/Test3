package F7_nonstatic_global_diff_method;

public class test3 
{
	String ClassName="Velocity";
	//main method
	public static void main(String[] args)
	{
		//create object
		test3 Q1=new test3();                 //ClassName objectName=new className();
		//call the variable
		System.out.println(Q1.ClassName);     //objectName.variableName;
		
		//call the static method
		m1();
		//call the non-static method
		test3 F1=new test3();
		F1.m2();
		
	}
	//static method
	public static void m1()
	{
		//create object
		test3 Q2=new test3();                       //ClassName objectName=new className();
		//call the variable
		System.out.println(Q2.ClassName);              //objectName.variableName;
	}
	//non-static method
	public void m2()
	{
		System.out.println(ClassName);                      //VariableName;
	}

}
