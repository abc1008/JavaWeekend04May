package basePack;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import testScripts.LoginTestScript;
import utility.ConfigReader;
import utility.ExtentReportHelper;

public class BaseClass
{
	public static WebDriver driver;
	public static String dateTimeStamp;
	
	@BeforeSuite
	public void inItDriver() throws IOException
	{
		
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyy_HH_mm_ss"); 
		dateTimeStamp = time.format(format);
		
		
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
		
		ExtentReportHelper extentReportHelper = new  ExtentReportHelper(driver,dateTimeStamp);
	}
	
//	@BeforeMethod
//	public void login() throws IOException
//	{
//
//	}
	
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
		ExtentReportHelper.endTest();
		driver.quit();
	}

}
