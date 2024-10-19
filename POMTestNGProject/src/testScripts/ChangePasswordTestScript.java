package testScripts;

import java.io.IOException;

import basePack.BaseClass;
import orangeHRMObjects.OrangeHRMApp;
import pom_pages.ChangePasswordPage;
import utility.ExtentReportHelper;

public class ChangePasswordTestScript extends BaseClass
{
	public boolean performChangePassword() throws IOException
	{
		boolean testResult = false;
		
		try
		{
			if (OrangeHRMApp.changePasswordPage().changePassword() == true)
			{
				ExtentReportHelper.logPass("Test Script Pass");
				testResult = true;
			} 
			else
				ExtentReportHelper.logFail("Test Script Fail.");

		} 
		catch (Exception ex)
		{
			ExtentReportHelper.logFail("Exception in method 'performChangePassword' : " + ex.getMessage());
			return false;
		}
		return testResult;
	}

}
