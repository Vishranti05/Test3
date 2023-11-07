package C1_Static_method_callfrom_same_class;

public class Demo_1 
{
	//1:Static regular method call from same class
	
	public static void main(String[] args)
	{
		m1();   //MethodName();
		m2();   //MethodName();
	}
	
	//static regular method
	public static void m1()
	{
		//m1 method body
		System.out.println("HI");
	}
	//static regular method
	public static void m2()
	{
		System.out.println("Hello");
	}

}
