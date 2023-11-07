package C3_Non_static_method_callfrom_different_class;

public class Test1
{
//2:non-static regular method call from different class
	public static void main(String[] args)
	{
		//Step1:Create object of different class
		Test11 S1=new Test11();   //className ObjectName=new ClassName();
		
		//Step2:call the method
		S1.m1();                 //ObjectName.MethodName();
	}
}
