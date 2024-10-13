package basePack;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import orangeHRMObjects.OrangeHRMApp;
import utility.ConfigReader;
import utility.ExtentReportHelper;

public class BaseClass
{
	public static WebDriver driver;
	public static String dateTimeStamp;

	public static void testSetup() throws IOException
	{
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyy_HH_mm_ss"); 
		dateTimeStamp = time.format(format);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = ConfigReader.readData("TestSiteUrl");
		driver.get(url); // url hit
		
		ExtentReportHelper extentReportHelper = new  ExtentReportHelper(driver,dateTimeStamp);
		
		ExtentReportHelper.startTest("Test Case Name");
		OrangeHRMApp.loginPage().login();
		
	}
	

	public static void tearDown()
	{
		OrangeHRMApp.loginPage().logout();
		ExtentReportHelper.endTest();
		driver.quit();
	}
	
	
	

}
