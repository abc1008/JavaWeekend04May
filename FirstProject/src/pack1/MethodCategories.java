package pack1;

public class MethodCategories
{
	static String var = "Global Var";
	
	public void addition(int a, int b)
	{
		
		int ans = a + b;
		System.out.println(ans);
	}
	
	public void getUser(String user)
	{
		
		 String fullNameUser = user + " Test";
		
		System.out.println(fullNameUser);
	}
	
	public int multiply()
	{
//		 void = nothing
		
		int a = 50;
		int b = 60;
		
		int ans = a * b;
//		System.out.println(ans);
		
		return ans;
	}
	
	
	// method with argument and return type
	public int getLergeNum(int a, int b)
	{
		int greaterNum = 0;
		
		if(a > b)
			greaterNum = a;
		else if(b > a)
			greaterNum = b;
		else
			greaterNum = -1;
		
		
		return greaterNum;
	}
	
	public static void main(String[] args)
	{
		
		MethodCategories m = new  MethodCategories();
	
		
		m.addition(50,60);
		
		m.getUser(var);
		
	int output = m.multiply();
		 
//		 System.out.println(output);
	
	   System.out.println(m.getLergeNum(50, 50));
	}
	
	
	
	

}
