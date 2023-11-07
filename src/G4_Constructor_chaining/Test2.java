package G4_Constructor_chaining;

public class Test2 
{
	//constructor chaining
	
	Test2()
	{
	this(5);	
	}
	
	Test2(int a)
	{
	this("Vishu");
	System.out.println(a);
	}
	
	Test2(String Name)
	{
		this('S');
		System.out.println(Name);
	}
	
	Test2(char z)
	{
		System.out.println(z);
	}
	
	public static void main(String[] args) 
	{
		Test2 T2=new Test2();
	}

}
