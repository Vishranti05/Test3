package C3_Non_static_method_callfrom_different_class;

public class Test4 
{
	//Non-static regular method call from different class
	public static void main(String[] args)
	{
		//step1:create object of different class
		Test41 S4=new Test41();                 //className objectName=new className();
		
		//Step2:call the method
		S4.m4();                                 //objectName.methodName();
		
	}

}
