package C3_Non_static_method_callfrom_different_class;

public class Test8 
{
	//2:Non-static regular method call from different class
	public static void main(String[] args)
	{
		//step1:create object of different class
		Test81 V2=new Test81();         //ClassName objectName=new ClassName();
				
	    //Step2:call the method
		V2.m2();                      //ObjectName.MethodName();
		
	}

}
