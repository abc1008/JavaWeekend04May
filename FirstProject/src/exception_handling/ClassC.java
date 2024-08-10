package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ClassC
{
	
	public void m1() throws FileNotFoundException
	{
		FileInputStream file = new FileInputStream("D:\\Trainings\\TESTOMETER\\Seleniun_JAVA_04May24_WEEKEND\\Excel_Fil.xlsx");
		System.out.println("File handled");
	
	
	}
	
	
	public void m2() throws FileNotFoundException
	{
		FileInputStream file = new FileInputStream("D:\\Trainings\\TESTOMETER\\Seleniun_JAVA_04May24_WEEKEND\\Excel_Fil.xlsx");
		System.out.println("File handled");
	
	
	}
	
	
	public static void main(String[] args) throws FileNotFoundException
	{
//		ClassC cc = new ClassC();
//		cc.m1();
//		
//		cc.m2();
		
		
		int a = 100;
		int b = 200;
		
		if(a < b)
		{
			throw new NullPointerException("NullPointerException found. value of a is less than b.");
		}
		else
		{
			System.out.println(a);
		}
		
	
	}
}
