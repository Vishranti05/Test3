package F1_Local_variable;

public class Demo5 
{
	//local variable
	
	//static method
	public static void division()
	{
		int a=12;
		int b=60;
		int div=b/a;
		System.out.println(div);
	}
	//non-static method
	public void addition(int v, int s) 
	{
		int sum=v+s;
		System.out.println(sum);
	}
	//main method
	public static void main(String[] args) 
	{
		//call the static method
		division();
		//create object
		Demo5 T1=new Demo5();
		//call the non-static method
		T1.addition(50,50 );
	}

}
