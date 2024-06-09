package pack1;

public class MethodsDiscussion
{
	
//SYNTAX:
	
//	public static void methodName()
//	{
//		// method Body/Logic
//	}
	public static void printText()
	{
		System.out.println("Text from printText method");
		
		// calling of non-static method inside static
		MethodsDiscussion ref1 = new MethodsDiscussion();
		ref1.multiplyNums();
	}
	
	public static void addNums()
	{
		int num1 = 90;
		int num2 = 20;
		int add = num1  + num2;
		
		System.out.println(add);
	}
	public void multiplyNums()
	{
		int num1 = 90;
		int num2 = 20;
		int product = num1  * num2;
		System.out.println(product);
		addNums();   // calling of static method in non-static
	}
	
	public void divideNums()
	{
		int num1 = 90;
		int num2 = 20;
		int division = num1 / num2;
		System.out.println(division);
		multiplyNums(); // calling of non-static method inside non-static
		
		// non-static method calling from another class
		MethodDiscussion2 ref2 =new MethodDiscussion2();
		ref2.m1();
	}
	
	public static void main(String[] args)
	{
//		calling static method
		
//		printText();  
		
//		addNums(); 
		
		
		// calling of Non-Static method
		
		MethodsDiscussion ref1 = new MethodsDiscussion();
//		ref1.multiplyNums();
		
		ref1.divideNums();
		
		
		
		
		
	}
	
}
