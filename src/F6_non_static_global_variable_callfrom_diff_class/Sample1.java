package F6_non_static_global_variable_callfrom_diff_class;

public class Sample1 
{
	public static void main(String[] args)
	{
		//step1:create object of different class
		Sample2 S1=new Sample2();              //className objectName=new classname();
		//step2:call the variable
		System.out.println(S1.z);          //objectName.variableName
		
	}

}
