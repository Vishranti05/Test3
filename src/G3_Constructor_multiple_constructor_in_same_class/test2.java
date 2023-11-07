package G3_Constructor_multiple_constructor_in_same_class;

public class test2 
{
	//-------------------------1.variable declaration----------------------
    int a ;
    int b ;
    String studentname ;
   //------------------------2.variable initialization---------------------- 
    
    
    test2()
    {
    	a=10 ;
    	b=20 ;
    }
    
    test2 (int c , int d)
    {
    	a=c ;
    	b=d ;
    }
    
    test2 (int e , int f , int g)
    {
    	a=e ;
    	b=f ;
    	b=g ;		
    }
    
    test2 (String sname)
    {
    	studentname=sname ;
    }
	//------------------------3.usage of variable --------------------------------
    public static void main(String[] args) 
    {
	  	test2 obj1 = new test2() ;
	  	obj1.m1() ;
	  	
	  	test2 obj2 = new test2() ;
	  	obj2.m2();
	  	
	  	test2 obj3 = new test2() ;
	  	obj3.m3() ;
	  	
	  	test2 obj4 = new test2("Nita") ;
	  	obj4.m4();
	  	
	  	test2 obj5 = new test2(100 , 20) ;
	  	obj5.m1();
	}
   //     ----        ----      ----        ----       ----        ----
    public void m1()
    {
    	 int sum = a+b ;
	  	 System.out.println(sum);
    //	     ----        ----      ----        ----       ----        ----
    }
    public void m2()
    {
    	
	  	int multi = a*b ;
    	System.out.println(multi);
    }
    //  ----        ----      ----        ----       ----        ----
    public void m3()
    {
    	int sum = a + b + b ;
    	System.out.println(sum);
    }
    //  ----        ----      ----        ----       ----        ----
    public void m4() 
    {
    	System.out.println(studentname);
    	
    }
}
