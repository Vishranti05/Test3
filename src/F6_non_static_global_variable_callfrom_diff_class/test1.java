package F6_non_static_global_variable_callfrom_diff_class;

public class test1
{
	// Non-static global variable call from different/another class
	
		public static void main(String[] args)
		{
			//Step1:create object of different class
			
			test2 T2=new test2();                   //className objectName=new className();
			
			//Step2:call the variable
			
			System.out.println(T2.c);               //objectName.variablename;
			
		}


}
