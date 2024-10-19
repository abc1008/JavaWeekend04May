package access_modifiers;

public class TestClass1
{
	protected int a = 100;  // protected variable
	private int b = 90;
	int c  = 800;  // default
	
	public void m1()
	{
		System.out.println("public m1 method of TestClass1");
		System.out.println("Git Pull Test");
	}
	
	// default method
	void m2()
	{
		System.out.println("default m2 method of TestClass1");
	}
	
	private void m3()
	{
		System.out.println("private m3 method of TestClass1");
	}
	
	protected void m4()  // protected method
	{
		System.out.println("protected m4 method of TestClass1");
	}
	
	public static void main(String[] args)
	{
		TestClass1 tc1 = new TestClass1();
		tc1.m3();
		
		System.out.println(tc1.b);
	}
	
}
