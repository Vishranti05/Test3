package B_Data_type;

public class DataType_1
{
public static void main(String[] args)
{
	  //step1:Variable declaration
	    byte a;
	    short b;
	    int c;
	    long d;
	    float e;
	    double g;
	    char f;
	    boolean h;
	    boolean i;
	    String k;
	    //Step2:variable initialization
	    a=100;                       //-128 to 127
	    b=30000;                     //-32,768 to 32,767
	    c=2147483647;                //-2,147,483,648 to 2,147,483,647
	    d=2147555555587L;            //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,808
	    e=500.25252525f;                //
	    g=2456.758585858;
	    f='b';
	    h=true;
	    i=false;
	    k="Software is a specialised set of program which take users input and generates desired output";
	     //Step3:Variable Usage
	     System.out.println(a);       //100
	     System.out.println(b);       //30000
	     System.out.println(c);       //2147483647
	     System.out.println(d);       //2147555555587
	     System.out.println(e);       //500.53425
	     System.out.println(g);       //2456.7585858
	     System.out.println(f);       //b
	     System.out.println(h);       //true
	     System.out.println(i);       //false
	     System.out.println(k);       //Software is a specialised set of program which take users input and generates desired output
	}
	
	
}
