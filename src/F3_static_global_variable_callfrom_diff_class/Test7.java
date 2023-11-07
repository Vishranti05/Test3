package F3_static_global_variable_callfrom_diff_class;

public class Test7 
{
	//static global variable call from different class
	public static void main(String[] args) 
	{
		System.out.println(Test8.Sname);              //ClassName.VariableName;
		System.out.println(Test8.Smarks);             //ClassName.VariableName;
		System.out.println(Test8.Sgrade);             //ClassName.VariableName;
		
	}

}
