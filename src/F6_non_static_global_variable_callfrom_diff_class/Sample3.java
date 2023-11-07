package F6_non_static_global_variable_callfrom_diff_class;

public class Sample3 
{
    public static void main(String[] args)
    {
    	       //step1:create object of different class
    			Sample4 S4=new Sample4();              //className objectName=new classname();
    			//step2:call the variable
    			System.out.println(S4.Sname);          //objectName.variableName
    			System.out.println(S4.Address);
    			
		
	}
}
