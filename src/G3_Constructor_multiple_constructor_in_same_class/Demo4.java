package G3_Constructor_multiple_constructor_in_same_class;

public class Demo4
{
	//Multiple constructor
	//Step1-Variable declaration
	int c;
	int d;
	char e;
	String f;
	//Step2-Variable initialization
	Demo4()
	{
		c=111;
		d=11;
		int div=c/d;
		System.out.println(div);
	}
	Demo4(int x,int y)
	{
		c=x;
		d=y;
		int div=c/d;
		System.out.println(div);
	}
	Demo4(char z)
	{
		e=z;
		System.out.println(e);
	}
	Demo4(String Worker)
	{
		System.out.println("Siddheash");
		
	}
	public static void main(String[] args)
	{
		Demo4 obj1=new Demo4();
		Demo4 obj2=new Demo4('A');
		Demo4 obj3=new Demo4("Name");
		Demo4 obj4=new Demo4(500,5);
		
		
		
	}

}
