package C1_Static_method_callfrom_same_class;

public class Demo_10
{
	//1:Static regular method call form same class
	public static void main(String [] args)
	{

		m10();     //MethodName();
		m11();     //MethodNmae();
		
	}
	//Static regular method
	public static void m10()
	{
		//m10 method body
		System.out.println("Daily standup meeting");
	}
	//Static regular method
	public static void m11()
	{
		System.out.println("Agile meetings");
	}

}
