package F5_non_static_global_variable_callfrom_same_class;

public class Demo6
{
	//Example-IV: Non-static Global variable call from same class
	
			int a=20;                                  //non-static global variable

		     public static void main(String[] args)
		      {
		    	  //step1:create object of same class
		    	 Demo6 D6=new Demo6();                  //className objectName=new ClassName();
		    	 
		    	 //step2:call the variable
		    	 System.out.println(D6.a);               //objectName.variableName
		    	  
		      }



}
