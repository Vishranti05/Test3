package G3_Constructor_multiple_constructor_in_same_class;

public class test5 
{
	//Step1:variable declaration
		int x;
		int y;
		String Studentname;
		//Step2:variable initialization
		test5()                   //--------->constructor with zero parameter
		{
			x=45;
			y=150;
		}
		test5(int a,int b)       //---------->constructor  with two integers parameter
		{
			x=a;
			y=b;
		}
		test5(String Sname)     //----------->constructor  with one String parameter
		{
			Studentname=Sname;
		}
		//Step3:usage
		public void addition()
		{
		 int sum=x+y;
		 System.out.println(sum);
		 
		}
		public void m1()
		{
			System.out.println(Studentname);
		}
		public static void main(String[] args) 
		{
			test5 A1=new test5();
			A1.addition();
			test5 A2=new test5(50,50);
			A2.addition();
			Demo2 A3=new Demo2("kavya");
			A3.m1();
			
			
			
		}
		

}
