package pack1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
import org.testng.asserts.SoftAssert;

import utility.ConfigReader;

public class Assrtions
{
	
	@Test
	public void TestCase4()
	{
		System.out.println("TestCase4");
		Assert.fail();
		
		System.out.println("After Hard Assert");
	}
	
	@Test
	public void TestCase5()
	{
		System.out.println("TestCase5");
		 
		SoftAssert sa = new SoftAssert();  // soft assert
		sa.fail(); 
		
		System.out.println("After Soft Assert");
		
		
		sa.assertAll();  // should be last line
		
		System.out.println("After assertAll");
		
	}
	
	
	
	@Test
	public void TestCase6()
	{
		System.out.println("TestCase6");
		
//		boolean testResult = true;
		
		String userID = "Admin";
		
		Assert.assertEquals(userID, "admin");

	}
	
	
	@Test
	public void TestCase7()
	{
		System.out.println("TestCase7");
		
		String userID = "Admin";
		
		Assert.assertNotEquals(userID, "Admin");

	}
	
	@Test
	public void TestCase8()
	{
		System.out.println("TestCase8");
		
		boolean result = false;
		
		Assert.assertTrue(result);

	}
	
	@Test
	public void TestCase9()
	{
		System.out.println("TestCase9");
		
		boolean result = true;
		
		Assert.assertFalse(result);

	}
	
	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String url = ConfigReader.readData("TestSiteUrl");
		driver.get(url); // url hit

		Thread.sleep(2000);

		WebElement userId = driver.findElement(By.id("input-email")); // locate WebElement
		userId.sendKeys(ConfigReader.readData("UserID")); // perform operation

		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(ConfigReader.readData("Password"));
//		 password.sendKeys("Login@123");

		Thread.sleep(2000); // click on login button
		driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='My Account']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click(); // logout click

		List<WebElement> logoutMsg = driver.findElements(By.xpath("//h1[text()='Account Logout']"));

	   String actualText = logoutMsg.get(0).getText();
	   
	   boolean result  = actualText.equals( "User has been logged out successfully.");
	   
	   
		
		Assert.assertTrue(result);


	}
	
	
	

}
