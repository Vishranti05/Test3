package G3_Constructor_multiple_constructor_in_same_class;

public class test1 
{
	// step1 - veriable declaration 
	   int a ; // non static variable
	   int b ; // non static variable
	   
	   // step 2 - variable initialization
	    test1()
	    {
	    a = 10 ; 
	    b = 20 ;
	    }
	    
	    test1(int c , int d )
	    {
	    	a=c ;
	        b=d ;
	    }
	   // step 3 - usage
	    
	    public void m1()
	    {
	    	int sum = a+b ;
	    	System.out.println(sum) ;
	    	
	    }
	    public void m2()
	    {
	    	int add = a+b ;
	    	System.out.println(add);
	    }
	   public static void main(String[] args) 
	   {
		    test1 obj1 = new test1() ;
		    obj1.m1();
		    
		    test1 obj2 = new test1(50,60);
		    obj2.m2() ;
	   }

}
