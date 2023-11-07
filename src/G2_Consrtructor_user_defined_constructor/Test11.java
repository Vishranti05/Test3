package G2_Consrtructor_user_defined_constructor;

public class Test11
{
	//variable declaration
	String Cricketer;                   //Virat  //Rohit    //shubman
	int Runs;                           //100    //50       //60
	
	
	//variable initialization
	
	Test11(String C1, int R1)
	{
		this.Cricketer=C1;          //Virat  //Rohit    //shubman
		this.Runs=R1;               //100    //50       //60
		
		System.out.println(C1);
		System.out.println(R1);
	}
	public static void main(String[] args) 
	{
		Test11 T1=new Test11("Virat",100);     //calssName objectName=new ClassName();
		Test11 T2=new Test11("Rohit",50);      //calssName objectName=new ClassName();
		Test11 T3=new Test11("Shubman",60);    //calssName objectName=new ClassName();
		
	}

}
