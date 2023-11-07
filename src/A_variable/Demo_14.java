package A_variable;

public class Demo_14 
{
	public static void main(String[] args)
	{
		//step1:variable declaration
		String BankName;               //DataTypeVariablename;
		int Amount;                    //DataTypeVariablename;
		char Rank;                     //DataTypeVariablename;
		float Profit;                  //DataTypeVariablename;
		
		//step2:variable initialization
		BankName="SBI";                //VariableName="VariableData";
		Amount=1000;                   //VariableName=VariableData;
		Rank='A';                      //VariableName='VariableData';
		Profit=55.0f;                    //VariableName=VariableData*f;
		
		//step3:variable usage
		System.out.println("Bank Name:"+BankName);          //SBI
		System.out.println("Amount:"+Amount);               //1000
		System.out.println("Rank:"+Rank);                   //A
		System.out.println("Profit:"+Profit+"%");           //55%
		
		
		
		
	}

}
