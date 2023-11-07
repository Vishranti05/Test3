package C2_Static_method_callfrom_different_class;

public class demo3 
{
           //2:static regular method call from different/another class
	public static void main(String[] args)
	{
		demo4.v1();          //className.MethodName
		demo4.v2();          //className.MethodName
		demo4.v3();         //className.MethodName
	}
	
}
