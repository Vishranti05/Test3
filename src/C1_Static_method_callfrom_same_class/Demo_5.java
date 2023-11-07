package C1_Static_method_callfrom_same_class;

public class Demo_5 
{
	//1:Static regular method call form same class
	public static void main(String[] args)
	{
		System.out.println("HIIIII");
		
		m5();                                  //MethodName();
		m6();                                 //MethodName();
	}
	//Static regular method
	public static void m5()
	{
		//m5 method body
	System.out.println("software testing");
	System.out.println("Manual and automation");
	}
	//Static regular method
	public static void m6()
	{
		System.out.println("Good practice");
	}
	

}
