package C3_Non_static_method_callfrom_different_class;

public class Test2 
{
	//2:Non-static regular method call from different class
	public static void main(String[] args)
	{
		//Step1:create object of different class
		
		Test21 S2=new Test21();      //className ObjectName=new ClassName();
		
		
		//Step2:call the method
		
		S2.m2();                  //ObjectName.methodName();
	}

}
