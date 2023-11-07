package F5_non_static_global_variable_callfrom_same_class;

public class Demo10
{
	String Name="Rucha";            //naonm-static global variable
	
	public static void main(String[] args)
	{
		//Step1:create object of same class
		Demo10 S1=new Demo10();
		//call the variable
		System.out.println(S1.Name);
		
	}

}
