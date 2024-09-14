package pack1;

import org.testng.annotations.Test;

public class TestClass1
{
	int a = 3;
	
	@Test(priority = -3, invocationCount = -3)
	public void m3()
	{
		System.out.println("m3");
	}
	
	@Test(priority = -3, enabled = false)
	public void b4()
	{
		System.out.println("b4");
	}
	
	@Test(priority = 3)
	public void a1()
	{
		System.out.println("a1");
	}
	
	@Test(priority = 2)
	public void m2()
	{
		System.out.println("m2");
	}
	


}
