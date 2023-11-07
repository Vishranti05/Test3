package C1_Static_method_callfrom_same_class;

public class Demo_4
{
	//1:static regular method call from same class
	public static void main(String[] args)
	{
		System.out.println("class name");
		m4();                     //MethodName();
		m5();                     //MethodName();
	}
	//Static regular method
	public static void m4()
	{
		//m4 method body
		System.out.println("velocity");
	}
	//static regular method
	public static void m5()
	{
		System.out.println("software Testing");
	}

}
