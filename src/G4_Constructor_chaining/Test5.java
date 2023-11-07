package G4_Constructor_chaining;

public class Test5 
{
	
	
	 Test5()
	 {
		this(20); 
	 } 
	
	 Test5(int a)
	 {
		 this("Radha");
		 System.out.println(a);
	 }
	
	 Test5(String Sname)
	 {
		this('A'); 
		System.out.println(Sname);
	 }
	
	 Test5(char x)
	 {
	System.out.println(x);
	 }
	 
	 
	 public static void main(String[] args)
	 {
		 Test5 T1=new Test5();
		 
		 
	 }
	
	

}
