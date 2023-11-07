package G3_Constructor_multiple_constructor_in_same_class;

public class Demo3 
{
	//Multiple constructor
	
	//Step1-variable declaration
	int y;
	int z;
	String Name;
	
	//Step2-Variable initialization
	Demo3()                  //------>zero parameter constructor
	{
		y=50;
		z=25;
	}
	Demo3(int a,int b)       //------>constructor with two integer parameter
	{
		y=a;
		z=b;
		int sum=a+b;
		System.out.println(sum);
	}
	Demo3(String Student)
	{
		System.out.println("Tanmay");
	}
	public static void main(String[] args) 
	{
		Demo3 D1=new Demo3();
		Demo3 D2=new Demo3(5,10);
		Demo3 D3=new Demo3("ABC");
		
	}

}
