package C5_method_with_and_without_parameter;

public class sample6
{
        public static void main(String[] args)
        {
        	StudentInfo("Sandip",5,'A',90.16f);      //methodName();
        	
        	StudentInfo("Vishranti",9,'A',90.10f);   //methodName();
        	
        	
        }
       
        //Static regular method---->with 4 parameter/argument
        
        public static void StudentInfo(String StudentName, int StudentRollNo, char StudentGrade, float StudentPercentage)
        {
        	System.out.println("Studentname="+StudentName);
        	System.out.println("studentrollnumber="+StudentRollNo);
        	System.out.println("studentgrade="+StudentGrade);
        	System.out.println("student percentage="+StudentPercentage+"%");
        }
        
}
