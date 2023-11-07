package G1_Constructor_default_constructor;

public class Test1 
{
	//Example-I: Default Constructor
	//Default Constructor-->Provided by Compiler
	
		//Test1(){}---------------------------------------->Default constructor
    public static void main(String[] args)
    {
    	//step1:create object of same class
    	Test1 S1=new Test1();                  //className objectName=new ClassName();
    	//step2:call the method
    	S1.multiplication();                    //objectName.methodName();
		
	}
    public void multiplication()
    {
    	int a=10;
    	int b=30;
    	int mulvalue=a*b;
    	System.out.println(mulvalue);
    }

}
