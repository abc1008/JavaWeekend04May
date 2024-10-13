package pom_pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExtentReportHelper;
import utility.JSMethods;


public class ChangePasswordPage
{
	static WebDriver driver;
	private final String buttonProfileIconByXpath = "//span[@class='oxd-userdropdown-tab']";
	private final String buttonChangePasswordByXpath = "//ul[@class='oxd-dropdown-menu']//a[text()='Change Password']";
	private final String textBoxCurrentPasswordByXpath = "(//input[@type='password'])[1]";
	private final String textBoxNewPasswordByXpath = "(//input[@type='password'])[2]";
	private final String textBoxConfirmPasswordByXpath = "(//input[@type='password'])[3]";
	private final String buttonSaveByXpath = "//button[text()=' Save ']";
	private final String msgSuccessByXpath = "//div[@id='oxd-toaster_1']//div//p[contains(@class,'toast-title')]";
	
	@FindBy(xpath = buttonProfileIconByXpath) 
	private WebElement buttonProfileIcon;
	
	@FindBy(xpath = buttonChangePasswordByXpath) 
	private WebElement buttonChangePassword;
	
	@FindBy(xpath = textBoxCurrentPasswordByXpath) 
	private WebElement textBoxCurrentPassword;
	
	@FindBy(xpath = textBoxNewPasswordByXpath) 
	private WebElement textBoxNewPassword;
	
	@FindBy(xpath = textBoxConfirmPasswordByXpath) 
	private WebElement textBoxConfirmPassword;
	
	@FindBy(xpath = buttonSaveByXpath) 
	private WebElement buttonSave;
	
	@FindBy(xpath = msgSuccessByXpath) 
	private List<WebElement> msgSuccess;

	
	// Constructor
	public ChangePasswordPage(WebDriver  driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);    // refer non-static variables of current class
	}
	
	
	
	public void clickProfileIcon()
	{
		buttonProfileIcon.click();
	}
	
	public void selectChangePassword()
	{
		buttonChangePassword.click();
	}
	
	public void enterPassword()
	{
		textBoxCurrentPassword.sendKeys("admin123");
		textBoxNewPassword.sendKeys("admin123");
		textBoxConfirmPassword.sendKeys("admin123");
	}
	
	public void clickSave()
	{
		buttonSave.click();
	}
	
	public void verifyToasterMessage()
	{
		if(msgSuccess.size() > 0)
		{
			System.out.println("Password changed successfully.");
		}
		else
			System.out.println("Unable to locate the toaster message.");
	}
	
	
	public boolean changePassword() throws IOException
	{
		boolean testResult = false;
		
		try
		{
			buttonProfileIcon.click();
			buttonChangePassword.click();
			textBoxCurrentPassword.sendKeys("admin123");
			textBoxNewPassword.sendKeys("admin123");
			textBoxConfirmPassword.sendKeys("admin123");
			
			buttonSave.click();
			
			if(msgSuccess.size() > 0)
			{
				ExtentReportHelper.logPass("Password changed successfully.");
//				System.out.println("Password changed successfully.");
				testResult = true;
			}
			else
//				System.out.println("Unable to locate the toaster message.");
				ExtentReportHelper.logFail("Unable to locate the toaster message.");
		}
		catch (Exception ex) 
		{
			ExtentReportHelper.logFail("Exception in method 'changePassword' : "+ ex.getMessage());
//			System.out.println("Exception in method 'changePassword' : "+ ex.getMessage());
			return false;
		}
		return testResult;
	}

	
}
