package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportHelper
{
	public static void main(String[] args)
	{
		String projectPath = System.getProperty("user.dir");
		String reportPath = projectPath + "\\TestResults\\report.html";
		
		ExtentReports extentReports = new ExtentReports();  // main class
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(reportPath);
		extentReports.attachReporter(extentSparkReporter);
		
		  ExtentTest test = extentReports.createTest("Test Case Name");
		  
		  test.log(Status.PASS, "Password changed successfully.");
		  
		  
		  extentReports.flush();  // end the reporting
		
		
		
	}

	

}
