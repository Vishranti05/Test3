package G4_Constructor_chaining;

public class Test6 
{
	Test6()
	{
	this(7);	
	}
	
	Test6(int a)
	{
	this("Yudha");
	System.out.println(a);
	}
	
	Test6(String Name)
	{
		this('Y');
		System.out.println(Name);
	}
	
	Test6(char z)
	{
		System.out.println(z);
	}
	
	public static void main(String[] args) 
	{
		Test6 T6=new Test6();
	}


}
