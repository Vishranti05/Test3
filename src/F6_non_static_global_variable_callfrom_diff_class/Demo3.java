package F6_non_static_global_variable_callfrom_diff_class;

public class Demo3
{
	public static void main(String[] args)
	{
		//step1:create object of different class
		Demo4 D4=new Demo4();              //className objectName=new classname();
		//step2:call the variable
		System.out.println(D4.c);          //objectName.variableName
		
	}

}
