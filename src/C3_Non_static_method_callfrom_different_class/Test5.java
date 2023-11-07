package C3_Non_static_method_callfrom_different_class;

public class Test5 
{
	//Non-static regular method call form different class
	public static void main(String[] args)
	{
		//Step1:create object of different class
		
		Test51 S5=new Test51();    //ClassName ObjectName=new ClassName();
		
		//Step2:call the method
		
		S5.m5();               //ObjectName.MethodName();
	}

}
