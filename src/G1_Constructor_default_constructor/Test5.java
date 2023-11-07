package G1_Constructor_default_constructor;

public class Test5
{
	//Test5(){}---------------------------------------->Default constructor
    public static void main(String[] args)
    {
    	//step1:create object of same class
    	Test5 S5=new Test5();                  //className objectName=new ClassName();
    	//step2:call the method
    	S5.multiplication();                    //objectName.methodName();
		
	}
    public void multiplication()
    {
    	int a=34;
    	int b=30;
    	int mulvalue=a*b;
    	System.out.println(mulvalue);
    }


}
