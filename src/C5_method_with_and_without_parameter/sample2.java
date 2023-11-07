package C5_method_with_and_without_parameter;

public class sample2 
{
	public static void main(String[] args)
	{
		substraction();
		substraction(50,25);
		substraction(60,30);
		substraction(100,50);
		
	}
	//Static regular method------>with zero parameter/no argument
	public static void substraction()
	{
		int a=15;
		int b=5;
		int sub=a-b;
		System.out.println(sub);   //10
	}
	//static regular method------>with parameter/argument
	public static void substraction(int c, int d)
	{
		int sub1=c-d;
		System.out.println(sub1);     //25  //30  //50
	}
	

}
