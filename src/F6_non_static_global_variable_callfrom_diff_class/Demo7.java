package F6_non_static_global_variable_callfrom_diff_class;

public class Demo7
{
	public static void main(String[] args)
	{
		//Step1:create object of different class
		Demo8 D8=new Demo8();             //ClassName objectName=new classname();
		//step2:call the variable
		System.out.println(D8.a);        //objectName.variableName
		System.out.println(D8.b);        //objectName.variableName
		
	}

}
