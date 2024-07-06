package polymorphism;

public class TestClassA
{
	
	int var1 = 100;
	int var2 = 200;
	
	// method signature = method name + method arguments
	
	 void m1()
	{
		System.out.println("0 arg m1 method of TestClassA");
	}
	
	public void m1(int a)
	{
		System.out.println("1 arg m1 method of TestClassA");
	}
	
	public void m2()
	{
		System.out.println("0 arg m2 method of TestClassA");
	}
	
	public static void m5()
	{
		System.out.println("static m5 method of TestClassA");
	}
	

	public static void main(String[] args)
	{
		
		TestClassA a1 = new TestClassA();
		a1.m1(6);
	

		
		
	}
	
	
	
	
	
	
	
	
}
