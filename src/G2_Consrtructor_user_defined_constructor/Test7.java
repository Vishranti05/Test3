package G2_Consrtructor_user_defined_constructor;

public class Test7 
{
	//User defined constructor
	//Step1-Variable declaration
		String Sname;
		char Grade;
		
	//Step2-Variable initialization
		Test7()
		{
			Sname="Vishranti";
			Grade='A';
		}
		//step3-usage
		public void m1()
		{
			System.out.println(Sname);
			System.out.println(Grade);
		}
		public static void main(String[] args) 
		{
			Test7 T7=new Test7();
			T7.m1();
			
		}

}
