package G3_Constructor_multiple_constructor_in_same_class;

public class Demo5 
{

	   // step1 - veriable declaration 
		   int a ; // non static variable
		   int b ; // non static variable
		   
		   // step 2 - variable initialization
		   Demo5()
		    {
		    a = 10 ; 
		    b = 20 ;
		    }
		    
		   Demo5(int c , int d )
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
			   Demo5  obj1 = new  Demo5 () ;
			    obj1.m1();
			    
			    Demo5  obj2 = new  Demo5 (50,60);
			    obj2.m2() ;
		   }





}
