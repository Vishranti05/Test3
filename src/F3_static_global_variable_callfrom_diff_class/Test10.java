package F3_static_global_variable_callfrom_diff_class;

public class Test10
{
	//static/class global variable call from different class
	
		public static void main(String[] args)
		{
			System.out.println(Test9.Studentname);         //ClassName.variableName;
			
			System.out.println(Test9.Grade);               //ClassName.VariableName;
			
		}

}
