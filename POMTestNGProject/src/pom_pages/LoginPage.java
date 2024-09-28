package pom_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ConfigReader;

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
		textBoxUserId.sendKeys(ConfigReader.readData("UserID"));
		textBoxPassword.sendKeys(ConfigReader.readData("Password"));
		buttonLogin.click();
	}
	
	
	public void logout()
	{
		buttonProfileIcon.click();
		buttonLogout.click();
	}
	
	
	
	

}
