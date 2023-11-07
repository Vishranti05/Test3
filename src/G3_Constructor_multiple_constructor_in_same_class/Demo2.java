package G3_Constructor_multiple_constructor_in_same_class;

public class Demo2
{
	//Step1:variable declaration
	int x;
	int y;
	String Studentname;
	//Step2:variable initialization
	Demo2()                   //--------->constructor with zero parameter
	{
		x=50;
		y=100;
	}
	Demo2(int a,int b)       //---------->constructor  with two integers parameter
	{
		x=a;
		y=b;
	}
	Demo2(String Sname)     //----------->constructor  with one String parameter
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
		Demo2 A1=new Demo2();
		A1.addition();
		Demo2 A2=new Demo2(50,50);
		A2.addition();
		Demo2 A3=new Demo2("Ishwari");
		A3.m1();
		
		
		
	}
	

}
