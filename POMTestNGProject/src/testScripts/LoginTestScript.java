package testScripts;
import basePack.BaseClass;
import pom_pages.LoginPage;


public class LoginTestScript extends BaseClass
{
	public void performLogin()
	{
		LoginPage lp = new LoginPage(driver);
		lp.login();
	}
	
	public void performLogout()
	{
		LoginPage lp = new LoginPage(driver);
		lp.logout();
	}
	

}
