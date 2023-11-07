package C1_Static_method_callfrom_same_class;

public class Demo_11
{
	//1:Static regular method call from same class
	public static void main(String[] args)
	{
		System.out.println("Very good morning");
		m11();                 //methodName();
		m12();                 //methodName();
		
	}
	//static regular method
	public static void m11()
	{
		System.out.println("Vey Good Evening");
		
	}
	//static regular method
	public static void m12()
	{
		System.out.println("hello everyone");
	}

}
