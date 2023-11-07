package C5_method_with_and_without_parameter;

public class sample3 
{
	public static void main(String[] args)
	{
		multiplication();
		multiplication(10,20);
		multiplication(8,9);
		multiplication(70,0);
		
	}
	//static regular method--------->with zero parameter
	public static void multiplication()
	{
		int a=5;
		int b=6;
		int multi=a*b;
		System.out.println(multi);    //30
	}
	//static regular method--------->with parameter
	public static void multiplication(int c, int d)
	{
		int multi1=c*d;                          
		System.out.println(multi1);           //200  //72   //0
		
	}

}
