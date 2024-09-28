package orangeHRMObjects;

import basePack.BaseClass;
import pom_pages.ChangePasswordPage;

public class OrangeHRMApp extends BaseClass
{
	private static ChangePasswordPage _changePasswordPage;
	
	public static ChangePasswordPage changePasswordPage()
	{
		_changePasswordPage  = new ChangePasswordPage(driver);
		return _changePasswordPage;
	}
	

}
