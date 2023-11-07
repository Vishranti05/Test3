package C1_Static_method_callfrom_same_class;

public class Demo_3 
{
	//1:Static regular method call from same class
	public static void main(String[] args)
	{
		System.out.println("Vishranti");
		m3();                //MethodName();
		m4();                //methodName();
	}
	//static regular method
	public static void m3()
	{
		//m3 method body
		System.out.println("Vishu");
	}
	//static regular method
	public static void m4()
	{
		System.out.println("Mau");
	}

}
