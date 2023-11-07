package C5_method_with_and_without_parameter;

public class Test1
{
	public static void main(String[] args)
	{
		addition();
		addition(100,20);
		addition(300,50);
		addition(1000,80);
		
	}
	//Static regular method------>with zero parameter/no argument
	public static void addition()
	{
		int a=25;
		int b=40;
		int sum=a+b;             //65
		
		System.out.println(sum);
	 }
	//Static regular method with parameter
	public static void addition(int c, int d)
	{
		int sum1=c+d;              
		System.out.println(sum1);  //120  //350   //1080
	}


}
