package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ClassA
{
	
	public static void main(String[] args) throws FileNotFoundException, InterruptedException 
	{
		
		int a = 10;
		int b = 0;
		
		Thread.sleep(5000);
		
		try
		{
			// risky code
			int c = a/b;  // connection string
			System.out.println("After exception line in try block");
			// code 
		}
		catch (Exception ex) 
		{
			System.out.println("Exception found : Exception "+ ex.getMessage());
		}
		finally
		{
			System.out.println("finally Block Running");  // clean-up activities
		}
		
		
		System.out.println("After try-catch");
		

	

		
		
	FileInputStream file = new FileInputStream("D:\\Trainings\\TESTOMETER\\Seleniun_JAVA_04May24_WEEKEND\\Excel_Fil.xlsx");
		
		
		

		
		
		
	}
	

}
