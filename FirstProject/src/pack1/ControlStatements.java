package pack1;

public class ControlStatements
{
	public static void main(String[] args)
	{

		 
		 
//		 SYNTAX of If-Else statement
		 
//		 if("boolean condition")
//		 {
//			  if block code
//		 }
//		 else
//		 {
//			 else block code
//		 }
		 
		
		int w = 10;
		int z = 20;
		 
		 if(w > 0)  
		 {
			 System.out.println("If block is running");
		 	 System.out.println("2nd line of If block");
		 }
		 else
			 System.out.println("Else block is running");
		 
		
		System.out.println("After if-else statement");
		
		
		
		int numToVerify = -225;   // 
		int remainder = numToVerify % 2;   // getting remainder
		
		System.out.println(remainder);
		
		if(remainder == 0)
		{
			System.out.println("Given number "+ numToVerify +" is Even");
		}
		else if(remainder < 0)
		{
			System.out.println("Remainder is less than zero and its odd");
		}
		else if(remainder != 0)
		{
			System.out.println("Given number "+ numToVerify +" is Odd");
		}

		
		System.out.println("After if-else block");
		
		
		
		
	}
}
