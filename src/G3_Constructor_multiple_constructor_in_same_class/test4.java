package G3_Constructor_multiple_constructor_in_same_class;

public class test4 
{

	//--------1.1 variable declaration---------
		
		                int a ;
		                int b ;
		
		 //-------1.2 variable initialization------
	   
		test4()
	     {
		   a = 10 ;
		   b = 25 ;
	     }
	     
		//-------1.3 variable usage--------------
		
		              public void m1()
		             {
		            	  
			          int sum = a+b ;
			          System.out.println(sum);
			          
			          int multi = a*b ;
			          System.out.println(multi);
			          
			          int minus = b-a ;
			          System.out.println(minus);
			          
			          double avg = sum/2 ;
			          System.out.println(avg);
		              }
		 
		 //--------------------------------------
		
		 public static void main(String[] args) 
		   {
		     test4 obj = new test4() ;
		     obj.m1();
		     //----------------------------
		     test4 obj1 = new test4(30 , 40);
		     obj1.m1();
		     //-------------------
		     test4 obj2 = new test4("good morning") ;
		    		 
		   }
		 //==============================================
		     test4(int c , int d)
		     {
		    	 this.a = c ;
		    	 this.b = d ;
		    	 
		     }
		     
		  //---------------------------------- 
		     test4 (String x )
		     {
		    	 System.out.println(x);
		     }
		


}
