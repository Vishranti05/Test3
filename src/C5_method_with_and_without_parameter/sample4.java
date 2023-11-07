package C5_method_with_and_without_parameter;

public class sample4 
{
	public static void main(String[] args)
	{
		division();
		division(100,10);
		division(64,8);
		division(72,9);
		}
	//Static regular method----->with zero parameter
	public static void division()
	{
		int a=50;
		int b=25;
		int div=a/b;
		System.out.println(div);      //2
	}
	//static regular method------->with parameter
	public static void division(int x, int y)
	{
		int div=x/y;
		System.out.println(div);           //10  //8   //8
	}

}
