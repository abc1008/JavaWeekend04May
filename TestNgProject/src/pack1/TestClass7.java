package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass7
{
	
	@Test(groups = "sanity1")
	public void m3()
	{
		System.out.println("m3");
//		Assert.fail();
	}
	
	@Test(dependsOnGroups = {"sanity1", "regression1" })
	public void b4()
	{
		System.out.println("b4");
	}
	
	@Test(groups = "sanity1")
	public void a1()
	{
		System.out.println("a1");
	}
	
	@Test(groups = "regression1")
	public void m2()
	{
		System.out.println("m2");
		Assert.fail();
	}
	
	@Test(groups = "sanity1")
	public void a2()
	{
		System.out.println("a2");
	}
	
	@Test(groups = "regression1")
	public void m4()
	{
		System.out.println("m4");
	}

}
