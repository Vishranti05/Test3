package C4_All_methods_program;

public class Sample1 
{
	public static void main(String[] args)
	{
		//1:static regular method from same class
		m1();                                          //methodName();
		
		//2:non-static regular method from same class
		
		//step1:create object of same class
		Sample1 T1=new Sample1();                     //ClassName objectName=new ClassName();
		//call the method
		T1.m2();                                     //ClassName.MethodName();
		
		//3:Static regular method call from different class
		Sample2.m3();
		
		//4:Non-Static regular method call form different class
		//Step1:create object of different class
		Sample2 T2=new Sample2();                    //ClassName objectName=new ClassName();
		//Step2:call the method
		T2.m4();                               //ClassName.MethodName();
		}
	//Static regular method
			public static void m1()
		{
			System.out.println("method m1 is running");
		}
      //Non-static regular method
			public void m2()
	    {
			System.out.println("method m2 is running");	
		}
}
