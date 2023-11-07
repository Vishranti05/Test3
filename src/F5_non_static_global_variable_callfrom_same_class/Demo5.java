package F5_non_static_global_variable_callfrom_same_class;

public class Demo5 
{
	String Mothername="Sunanda";            //naonm-static global variable
	
	public static void main(String[] args)
	{
		//Step1:create object of same class
		Demo5 S1=new Demo5();
		//call the variable
		System.out.println(S1.Mothername);
		
	}

}
