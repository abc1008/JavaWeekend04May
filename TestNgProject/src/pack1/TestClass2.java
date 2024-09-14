package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass2
{

	@Test
	public void TestCase3()
	{
		System.out.println("TestCase3");
	}
	
	@Test
	public void TestCase2()
	{
		System.out.println("TestCase2");
	}
	
	@Test
	public void TestCase1()
	{
		System.out.println("TestCase1");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}

}
