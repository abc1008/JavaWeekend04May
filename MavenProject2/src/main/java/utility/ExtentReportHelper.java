package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

public class ExtentReportHelper
{
	static ExtentReports extentReports;
	static ExtentTest test;
	static WebDriver driver;

	public ExtentReportHelper(WebDriver driver, String dateTimeStamp)
	{
		String projectPath = System.getProperty("user.dir");
		String reportPath = projectPath + "\\TestResults\\Report_"+dateTimeStamp+".html";

		extentReports = new ExtentReports(); // main class
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(reportPath);
		extentReports.attachReporter(extentSparkReporter);
		this.driver = driver;
	}

	public static void startTest(String testCaseName)
	{
		test = extentReports.createTest(testCaseName);
	}

	public static void logPass(String msg)
	{
		test.log(Status.PASS, msg);
	}

	public static void logFail(String msg) throws IOException
	{
		test.log(Status.FAIL, msg, printScreen(driver));
	}

	public static void logInfo(String msg)
	{
		test.log(Status.INFO, msg);
	}

	public static void endTest()
	{
		extentReports.flush(); 
	}
	
	
	public static Media printScreen(WebDriver driver) throws IOException
	{
		TakesScreenshot screen = (TakesScreenshot) driver; 					// typecsting
		String screenShot = screen.getScreenshotAs(OutputType.BASE64); // taking screenshot
		
		return MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot).build();
	}

}
