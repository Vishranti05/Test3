package C1_Static_method_callfrom_same_class;

public class Demo_2
{
	//1:static regular method call from same class
    public static void main(String[] args)
    {
    	System.out.println("hi");
    	m2();                     //MethodName();
    	m3();                     //MethodName();
    }
    //static regular method
    public static void m2()
    {
    	//m2 method body
    	System.out.println("hello");
    	System.out.println("Good Morning");
     }
    //Static regular method
    public static void m3()
    {
    	System.out.println("how are you?");
    }
}
