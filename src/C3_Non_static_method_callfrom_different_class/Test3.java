package C3_Non_static_method_callfrom_different_class;

public class Test3
{
	//2:Non-static regular method call form different
	public static void main(String[] args)
	{
		//Step1:create object of different class
		
		Test31 S3=new Test31();            //ClassName ObjectName=new ClassName();
		
		//Step2:call the method
		
		S3.m3();                           //objectName.methodName()
	}

}
