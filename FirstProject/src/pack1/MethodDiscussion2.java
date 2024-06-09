package pack1;

public class MethodDiscussion2
{
	public void m1()
	{
		System.out.println("m1");
	}
	
	
	public static void main(String[] args)
	{
		
		// ClassName.methodName();
		
		MethodsDiscussion.printText();  // calling from another class
		
		MethodsDiscussion.addNums();  
		
		MethodsDiscussion m1 = new MethodsDiscussion();
		m1.multiplyNums();
		
	}

}
