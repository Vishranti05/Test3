package C3_Non_static_method_callfrom_different_class;

public class Test7 
{
	//!:Non-static regular method call from different class
	public static void main(String[] args)
	{
		//Step1:create object of same class
		Test71 V1=new Test71();     //ClassName objectName=new ClassName();
		
		//Step2:call the method
		V1.m1();                   //ObjectName.Methodname();
		
	}

}
