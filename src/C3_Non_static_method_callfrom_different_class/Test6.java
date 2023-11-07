package C3_Non_static_method_callfrom_different_class;

public class Test6
{
   //2:Non-static regular method call from different class
	public static void main(String[] args)
	{
		//Step1:create object of different class
		Test61 S6=new Test61();       //className objectName=new ClassName();
		
		
		//Step2:call the method
		S6.m6();                    //ObjectName.MethodName();
		
	}
}
