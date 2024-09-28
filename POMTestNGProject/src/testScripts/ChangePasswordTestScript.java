package testScripts;

import basePack.BaseClass;
import orangeHRMObjects.OrangeHRMApp;
import pom_pages.ChangePasswordPage;

public class ChangePasswordTestScript extends BaseClass
{
	public boolean performChangePassword()
	{
		boolean testResult = false;

		try
		{
			if (OrangeHRMApp.changePasswordPage().changePassword() == true)
			{
				System.out.println("Test Script Pass");
				testResult = true;
			} else
				System.out.println("Test Script Fail.");
		} catch (Exception ex)
		{
			System.out.println("Exception in method 'performChangePassword' : " + ex.getMessage());
			return false;
		}
		return testResult;
	}

}
