package G3_Constructor_multiple_constructor_in_same_class;

public class test3 
{

	//-----------------------1.variable declaration-------------------------
	               int a ;
	               int b ;
	   //------------------------2.variable initialization---------------------- 
	       test3()
	       {
	    	   a=5 ;
	    	   b=6 ;
	       }
	       
	       test3(int x , int y)
	       {
	    	   x=a ;
	    	   y=b ;
	       }
	    //----------------------------------------------------------------------
	    
	    public void m1 ()
	    {
	    	int sum = a+b ;
	    	System.out.println(sum);
	    }
	    //----------------------------------------------------------------------
	    
	    public void m2(int c)
	    {
	    	int sum1 = a+b+c ;
	    	System.out.println(sum1);
	    }
	    
	    //----------------------------------------------------------------------
	    public static void main(String[] args) 
	    {
			test3 obj1 = new test3() ;
			obj1.m1();
			obj1.m2(10);
		}
	    //---------------------------


}
