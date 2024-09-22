package testSuites;

import org.testng.annotations.Test;

import basePack.BaseClass;
import testScripts.ChangePasswordTestScript;

public class ChangePasswordTestSuite extends BaseClass
{
	@Test
	public void tc123_ChnagePasswordTest()
	{
		ChangePasswordTestScript changePasswordTestScript = new ChangePasswordTestScript();
		changePasswordTestScript.performChangePassword();
	}
	
	
	
	
	
}
