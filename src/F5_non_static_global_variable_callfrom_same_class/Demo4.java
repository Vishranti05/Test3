package F5_non_static_global_variable_callfrom_same_class;

public class Demo4 
{
	Float c=56.97f;
	
public static void main(String[] args)
{
	//step1:create object of same class
	Demo4 V1=new Demo4();               //className objectName=new CalssName();
	//step2:call the variable
	System.out.println(V1.c);           //objectName.variableName
	
}

}
