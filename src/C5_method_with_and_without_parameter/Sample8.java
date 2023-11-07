package C5_method_with_and_without_parameter;

public class Sample8
{

	public static void main(String[] args)
	{
	//Step1:create object of same class
		Sample8 V1=new Sample8();     //ClassName ObjectName=new ClassaName();
		
    //step2:call the method
		V1.addition(100,300,400);       //ObjectName.MethodName();
		V1.addition(400, 300,900);
		
	}
	
	//non-static regular method------->with parameter
	public void addition(int x, int y, int z)
	{
		int sum=x+y+z;
		System.out.println(sum);          //800    //1600
		
	}
}
