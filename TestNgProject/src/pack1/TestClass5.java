package pack1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass5
{
	
	@Test
	public void TestCase9()
	{
		System.out.println("TestCase9");
	}
	
	@Test
	public void TestCase10()
	{
		System.out.println("TestCase10");
	}
	
	@Test
	public void TestCase11()
	{
		System.out.println("TestCase11");
	}
	
	@Test
	public void TestCase12()
	{
		System.out.println("TestCase12");
	}
	
	@Test
	public void TestCase13()
	{
		System.out.println("TestCase13");
		Assert.fail();
	}

}
