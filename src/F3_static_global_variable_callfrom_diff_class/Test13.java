package F3_static_global_variable_callfrom_diff_class;

public class Test13 
{
	//static global variable call from different class
		public static void main(String[] args) 
		{
			System.out.println(Test14.Sname);              //ClassName.VariableName;
			System.out.println(Test14.Smarks);             //ClassName.VariableName;
			System.out.println(Test14.Sgrade);             //ClassName.VariableName;
			
		}


}
