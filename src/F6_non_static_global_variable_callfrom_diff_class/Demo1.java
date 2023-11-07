package F6_non_static_global_variable_callfrom_diff_class;

public class Demo1 
{
	// Non-static global variable call from different/another class
	
			public static void main(String[] args)
			{
				//Step1:create object of different class
				
				Demo2 D2=new Demo2();                   //className objectName=new className();
				
				//Step2:call the variable
				
				System.out.println(D2.c);               //objectName.variablename;
				
			}


}
