package F6_non_static_global_variable_callfrom_diff_class;

public class test3
{
	public static void main(String[] args)
	{
		//step1:create object of different class
		test4 A1=new test4();              //className objectName=new classname();
		//step2:call the variable
		System.out.println(A1.c);          //objectName.variableName
		
	}

}
