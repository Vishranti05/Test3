package F5_non_static_global_variable_callfrom_same_class;

public class Demo7
{
	String Sname="Ovi";                        //non-static/instance global variable
	
	public static void main(String[] args) 
	{
		//step1:create object of same class
		Demo7 D7=new Demo7();                 //ClassName ObjectName=new ClassName();
		System.out.println(D7.Sname);         //ObjectName.VariableName
		
	}


}
