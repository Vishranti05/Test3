package A_variable;

public class Demo_13 
{
	public static void main(String[] args)
	{
	//Step1:variable declaration
		String PlayerName;                 //DataType variableName;
		int PlayerNumber;                  //DataType variableName;
		char PlayerGroup;                  //DataType variableName;
		float PlayerAvgRun;                //DataType variableName;
		
		//Step2:variable initialization
	    PlayerName="Virat";               //VariableName="VariableData";
		PlayerNumber=11;                  //VariableName=VariableData;
		PlayerGroup='Z';                  //VariableName='VariableData';
		PlayerAvgRun=15.17f;              //VariableName=VariableData*f;
		
		//variable usage
		System.out.println("Player name:"+PlayerName);          //Virat
		System.out.println("Player Number:"+PlayerNumber);      //11
		System.out.println("Player group:"+PlayerGroup);        //Z
		System.out.println("Player Average Run:"+PlayerAvgRun); //15.17%
	}

}
