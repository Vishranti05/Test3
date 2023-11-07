package C1_Static_method_callfrom_same_class;

public class Demo_6
{
	//1:static regular method call from same class
	public static void main(String[] args)
	{
		System.out.println("Vishranti");
		m6();                            //MethodName();
		m7();                            //MethodName();
	}
	//static regular method
	public static void m6()
	{
		//m6 method body
		System.out.println("Sampat");
		System.out.println("Jadhav");
	}
	//Static regular method
	public static void m7()
	{
		System.out.println("ME");
	}

}
