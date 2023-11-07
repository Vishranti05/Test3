package F5_non_static_global_variable_callfrom_same_class;

public class Demo2 
{
	String Sname="Ovi";                        //non-static/instance global variable
	
	public static void main(String[] args) 
	{
		//step1:create object of same class
		Demo2 T1=new Demo2();                 //ClassName ObjectName=new ClassName();
		System.out.println(T1.Sname);         //ObjectName.VariableName
		
	}

}
