package C2_Static_method_callfrom_different_class;

public class demo1 
{
	//static regular method call from different/another class
	public static void main(String[] args)
	{
		System.out.println("MY FAMILY");
		demo2.s1();
		demo2.s2();
		demo2.s3();
		demo2.s4();
		demo2.s5();
		demo2.s6();
	}

}
