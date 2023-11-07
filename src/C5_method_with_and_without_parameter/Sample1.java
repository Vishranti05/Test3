package C5_method_with_and_without_parameter;

public class Sample1
{
	public static void main(String[] args)
	{
		addition();
		addition(50,20);
		addition(30,50);
		addition(100,890);
		
	}
	//Static regular method------>with zero parameter/no argument
	public static void addition()
	{
		int a=10;
		int b=20;
		int sum=a+b;             //30
		
		System.out.println(sum);
	 }
	//Static regular method with parameter
	public static void addition(int c, int d)
	{
		int sum1=c+d;              //70   /80
		System.out.println(sum1);  //70  //80
	}

}
