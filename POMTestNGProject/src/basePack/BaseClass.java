package basePack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import testScripts.LoginTestScript;

public class BaseClass
{
	public static WebDriver driver;
	
	@BeforeSuite
	public void inItDriver()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit wait
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // url hit
	}
	
	@BeforeMethod
	public void login()
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
