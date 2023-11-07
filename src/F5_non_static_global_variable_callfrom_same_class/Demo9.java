package F5_non_static_global_variable_callfrom_same_class;

public class Demo9 
{
	Float c=18.97f;
	
	public static void main(String[] args)
	{
		//step1:create object of same class
		Demo9 V1=new Demo9();               //className objectName=new CalssName();
		//step2:call the variable
		System.out.println(V1.c);           //objectName.variableName
		
	}

}
