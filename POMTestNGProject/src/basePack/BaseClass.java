package basePack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import testScripts.LoginTestScript;
import utility.ConfigReader;

public class BaseClass
{
	public static WebDriver driver;
	
	@BeforeSuite
	public void inItDriver() throws IOException
	{
		String browserName = ConfigReader.readData("BrowserType");
		
		if(browserName.equals("CHROME"))
			driver = new ChromeDriver();
		else if(browserName.equals("EDGE"))
			driver = new EdgeDriver();
		else
			System.out.println("Browser name is incorrect");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit wait
		driver.manage().window().maximize();
		driver.get(ConfigReader.readData("TestSiteUrl")); // url hit
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		LoginTestScript loginTestScript = new LoginTestScript();
		loginTestScript.performLogin();
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Thread.sleep(3000);
		LoginTestScript loginTestScript = new LoginTestScript();
		loginTestScript.performLogout();
	}
	
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
	}

}
