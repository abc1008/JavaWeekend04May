package basePack;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testScripts.LoginTestScript;
import utility.ExtentReportHelper;

public class ListenerClass implements ITestListener
{
	public void onTestStart(ITestResult result)
	{
		System.out.println("onTestStart : "+result.getName());
		ExtentReportHelper.startTest(result.getName());
		
		LoginTestScript loginTestScript = new LoginTestScript();
		
		try
		{
			loginTestScript.performLogin();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void onTestSuccess(ITestResult result)
	{
		System.out.println("onTestSuccess : "+result.getName());
	}


	public void onTestFailure(ITestResult result)
	{
		System.out.println("onTestFailure");
	}


	public void onTestSkipped(ITestResult result)
	{
		System.out.println("onTestSkipped");
	}


	public void onStart(ITestContext context)
	{
		System.out.println("onStart");
	}


	public void onFinish(ITestContext context)
	{
		System.out.println("onFinish");
	}
	
	
	
	
	
	
	
	

}
