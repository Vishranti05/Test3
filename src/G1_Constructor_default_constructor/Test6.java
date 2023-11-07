package G1_Constructor_default_constructor;

public class Test6 
{
	//Default constructor provided by compiler
		//Test6(){}------------------------->Default constructor
		
		public static void main(String[] args) 
		{
			//create object of same class
			Test6 obj6=new Test6();
			//call the method
			obj6.division();
			
		}
		public void division()
		{
			int a=225;
			int b=25;
			int div=a/b;
			System.out.println(div);
		}


}
