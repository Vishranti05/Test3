package F5_non_static_global_variable_callfrom_same_class;

public class Demo3 
{
	String Name="Virat";                    //non-static global variable
	//main method
	public static void main(String[] args)
	{
		//create object
		Demo3 S1=new Demo3();
		//call the variable
		System.out.println(S1.Name);
		
	}

}
