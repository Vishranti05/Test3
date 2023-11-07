package F7_nonstatic_global_diff_method;

public class test8 
{
	String ClassName="Smart Tution";
	//main method
	public static void main(String[] args)
	{
		//create object
		test8 Q1=new test8();                 //ClassName objectName=new className();
		//call the variable
		System.out.println(Q1.ClassName);     //objectName.variableName;
		
		//call the static method
		m1();
		//call the non-static method
		test8 F1=new test8();
		F1.m2();
		
	}
	//static method
	public static void m1()
	{
		//create object
		test8 Q2=new test8();                       //ClassName objectName=new className();
		//call the variable
		System.out.println(Q2.ClassName);              //objectName.variableName;
	}
	//non-static method
	public void m2()
	{
		System.out.println(ClassName);                      //VariableName;
	}


}
