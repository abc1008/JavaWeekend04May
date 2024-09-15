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

public class TestClass4
{
	
	@Test
	public void TestCase4()
	{
		System.out.println("TestCase4");
	}
	
	@Test
	public void TestCase5()
	{
		System.out.println("TestCase5");
//		Assert.fail();
	}
	
	@Test
	public void TestCase6()
	{
		System.out.println("TestCase6");

	}
	
	@Test
	public void TestCase7()
	{
		System.out.println("TestCase7");
	}
	
	@Test
	public void TestCase8()
	{
		System.out.println("TestCase8");
	}

}
