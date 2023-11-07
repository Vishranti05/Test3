package C5_method_with_and_without_parameter;

public class sample5 
{
        public static void main(String[] args)
   {
        	//step1:create object of same class
        	
        	sample5 S1=new sample5();              //className objectName=new className();
        	
        	//Step2:call the method
        	S1.addition(100, 200,400);            //objectName.methodName()
	
   }
        //Non-static regular method----->with parameter/argument
        public void addition(int x, int y, int z)
        {
        	int sum=x+y+z;
        	System.out.println(sum);
        			
        }
        
}
