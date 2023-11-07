package F6_non_static_global_variable_callfrom_diff_class;

public class Demo5
{
	// Non-static global variable call from different/another class
	
				public static void main(String[] args)
				{
					//Step1:create object of different class
					
					Demo6 D6=new Demo6();                   //className objectName=new className();
					
					//Step2:call the variable
					
					System.out.println(D6.c);               //objectName.variablename;
					
				}


}
