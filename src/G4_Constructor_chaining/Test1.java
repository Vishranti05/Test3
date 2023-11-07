package G4_Constructor_chaining;

public class Test1 
{
	//Constructor Chaining
	
		 Test1()
		 {
			this(20); 
		 } 
		
		 Test1(int a)
		 {
			 this("Virat");
			 System.out.println(a);
		 }
		
		 Test1(String Sname)
		 {
			this('A'); 
			System.out.println(Sname);
		 }
		
		 Test1(char x)
		 {
		System.out.println(x);
		 }
		 
		 
		 public static void main(String[] args)
		 {
			 Test1 Z1=new Test1();
			 
			 
		 }
		
		
	}




