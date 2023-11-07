package G3_Constructor_multiple_constructor_in_same_class;

public class Demo1 
{
	//Declaration of Multiple Constructors in Same Class
	
	//Step1:variable declaration
	int x;                           //Non-static global variable
	int y;                           //Non-static global variable
	String StudentName;              //Non-static global variable
	//Step2:variable initialization
	Demo1()                         //User defined constructor---->with zero parameter
	{
		x=20;
		y=40;
	}
	Demo1(int a,int b)              //User defined constructor----->with two integer parameter
	{
		x=a;
		y=b;
	}
	Demo1(String Sname)             //User defined constructor------->with one string parameter
	{
		StudentName=Sname;
	}
	//Step3:Usage
	public void addition()
	{
		int add1=x+y;
		System.out.println(add1);
	}
	public void m1()
	{
		System.out.println(StudentName);
	}
	//main method
	public static void main(String[] args) 
	{
		//create object of same class
		Demo1 S1=new Demo1();
		S1.addition();
		//create object of same class
		Demo1 S2=new Demo1(50,60);
		S2.addition();
		//create object of same class
		Demo1 S3=new Demo1("Vishranti");
		S3.m1();
		
	}
}
