package orangeHRMObjects;

import basePack.BaseClass;
import pom_pages.ChangePasswordPage;
import pom_pages.LoginPage;

public class OrangeHRMApp extends BaseClass
{
	private static ChangePasswordPage _changePasswordPage;
	
	public static ChangePasswordPage changePasswordPage()
	{
		_changePasswordPage  = new ChangePasswordPage(driver);
		return _changePasswordPage;
	}
	

	private static LoginPage _loginPage;
	public static LoginPage loginPage()
	{
		_loginPage = new LoginPage(driver);
		
		return _loginPage;
	}
	
	
}
