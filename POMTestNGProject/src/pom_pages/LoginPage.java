package pom_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ConfigReader;
import utility.ExtentReportHelper;

public class LoginPage
{
	private final String textBoxUserIdByXpath = "//input[@name='username']";
	private final String textBoxPasswordByXpath = "//input[@name='password']";
	private final String buttonLoginByXpath = "//button[@type='submit']";
	private final String buttonProfileIconByXpath = "//span[@class='oxd-userdropdown-tab']";
	private final String buttonLogoutByXpath = "//a[text()='Logout']";
	
	
	@FindBy(xpath = textBoxUserIdByXpath) 
	private WebElement textBoxUserId;
	
	@FindBy(xpath = textBoxPasswordByXpath) 
	private WebElement textBoxPassword;
	
	@FindBy(xpath = buttonLoginByXpath) 
	private WebElement buttonLogin;
	
	@FindBy(xpath = buttonProfileIconByXpath) 
	private WebElement buttonProfileIcon;
	
	@FindBy(xpath = buttonLogoutByXpath) 
	private WebElement buttonLogout;
	
	// Constructor
	public LoginPage(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);    // refer non-static variables of current class
	}
	
	
	// methods
	public void login() throws IOException
	{
		ExtentReportHelper.logInfo("Performin Login.");
		
		textBoxUserId.sendKeys(ConfigReader.readData("UserID"));
		ExtentReportHelper.logInfo("Entered User ID.");
		textBoxPassword.sendKeys(ConfigReader.readData("Password"));
		ExtentReportHelper.logInfo("Entered User Password.");
		buttonLogin.click();
		ExtentReportHelper.logInfo("Clicked on Login button.");
	}
	
	
	public void logout()
	{
		buttonProfileIcon.click();
		ExtentReportHelper.logInfo("Clicked on Profile icon for logout.");
		buttonLogout.click();
		ExtentReportHelper.logInfo("Selected Logout option from profile icon menu.");
	}
	
	
	
	

}
