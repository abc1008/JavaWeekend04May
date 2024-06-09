package pack1;

public class LoopsDiscussion
{
	
	
	public static void main(String[] args)
	{
		
		// SYNTAX
		
//		while(boolean condition)
//		{
//			//  code to repeat/iterate
//		}
		
//		System.out.println("Loop");
//		System.out.println("Loop");
//		System.out.println("Loop");
//		System.out.println("Loop");
//		System.out.println("Loop");
		
		System.out.println();
		System.out.println("********* While Loop *********");
		System.out.println();
		
		int i = 1;

		while(i <= 5)
		{
			i++;
			if(i == 3)
			{
				continue;
			}
			System.out.println("Loop");
		}
		
		System.out.println("out of while loop.");
		

	
		System.out.println();
		System.out.println("********* Do - While Loop *********");
		System.out.println();
	
//	SYNTAX :
	
// 	do
//	    {
//		 		// code to repeat
//	    }
// 	while(boolean condition);
	
	
	int j = 1;
	
	do
	{
		System.out.println("Loop");
		j++;
	}
	while(j <= 5);
	
	System.out.println("out of do-while loop.");
	
	
	
	System.out.println();
	System.out.println("********* For Loop *********");
	System.out.println();
	
	
//					1					2,5,8					4,7
//		for(initialization, condition, increment/decrement)
//		{
//		 			3,6
//			// code to repeat
//		
//		}	

	for(int k = 1;   k <= 5;      k++)         // k = 1, 2,3,4,5,6
	{
		System.out.println("Loop");
	}
	
	System.out.println("out of for loop.");
	
	System.out.println();
	System.out.println("********* Array using For Loop *********");
	System.out.println();
	
	int [] array =  { 50 , 55, 60 , 40, 70, 80};   
	
//	System.out.println(array[0]);
//	System.out.println(array[1]);
//	System.out.println(array[2]);
//	System.out.println(array[3]);
//	System.out.println(array[4]);

	for(int index = 0; index <= 4; index++)
	{
		System.out.println(array[index]);
	}
	
	System.out.println("out of for loop.");
	
	
	System.out.println();
	System.out.println("********* Array using ForEach Loop *********");
	System.out.println();
	
//	int [] array =  { 50 , 80 , 60 , 40, 70 };   
	
//	 SYNTAX:
	
	for(  int num : array )
	{
		System.out.println(num);
	}
	
	System.out.println("out of for-each loop.");	
	
	
	System.out.println();
	System.out.println("********* Keywords in Loop *********");
	System.out.println();
	
//	int [] array =  { 50 , 55 , 60 , 40, 70,80 };   
	
//	 SYNTAX:
	
	for(  int num : array )
	{
		if(num == 60)
		{
			continue;  	// to skip current condition and jump to next one
//			break;         // to break the loop
		}
		
		System.out.println(num);
	}
	System.out.println("out of for-each loop.");	
	
	
	
	System.out.println();
	System.out.println("********* Print even/odd nums in Loop *********");
	System.out.println();
	
	
	for(int num = 1; num <=10; num++)
	{
		if(num % 2 == 0) // whether given num is even
		{
			continue;
		}
		
		System.out.println(num);
	}
	
	
	
	}
}
