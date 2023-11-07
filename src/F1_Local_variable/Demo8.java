package F1_Local_variable;

public class Demo8 
{
	//local variable
	
		//static method
		public static void division()
		{
			int a=120;
			int b=15;
			int div=a/b;
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
			T1.addition(67,89 );
		}


}
