package testScripts;

import basePack.BaseClass;
import pom_pages.ChangePasswordPage;

public class ChangePasswordTestScript extends BaseClass
{
	public void performChangePassword()
	{
		ChangePasswordPage cp = new ChangePasswordPage(driver);
		cp.changePassword();
		
	}

}
