package F6_non_static_global_variable_callfrom_diff_class;

public class test5
{
	public static void main(String[] args)
	{
		//Step1:create object of different class
		test6 H1=new test6();             //ClassName objectName=new classname();
		//step2:call the variable
		System.out.println(H1.a);        //objectName.variableName
		System.out.println(H1.b);        //objectName.variableName
		
	}

}
