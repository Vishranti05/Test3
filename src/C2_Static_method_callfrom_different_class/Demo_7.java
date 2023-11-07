
package C2_Static_method_callfrom_different_class;

public class Demo_7
{
	//2:Static regular method call from different/another class
	public static void main(String[] args)
	{
		Demo_8.v1();            //Classname.MethodName();
		Demo_8.v2();            //Classname.MethodName();
		Demo_8.v3();            //Classname.MethodName();
	}

}
