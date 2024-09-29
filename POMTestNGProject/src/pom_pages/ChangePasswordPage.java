package pom_pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utility.ExtentReportHelper;

public class ChangePasswordPage
{
	private final String buttonProfileIconByXpath = "//span[@class='oxd-userdropdown-tab']";
	private final String buttonChangePasswordByXpath = "//ul[@class='oxd-dropdown-menu']//a[text()='Change Password']";
	private final String textBoxCurrentPasswordByXpath = "(//input[@type='password'])[1]";
	private final String textBoxNewPasswordByXpath = "(//input[@type='password'])[2]";
	private final String textBoxConfirmPasswordByXpath = "(//input[@type='password'])[3]";
	private final String buttonSaveByXpath = "//button[text()=' Save ']";
	private final String msgSuccessByXpath = "//div[@id='oxd-toaster_1']//div//p[contains(@class,'toast-titlett')]";
	
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
		PageFactory.initElements(driver, this);    // refer non-static variables of current class
	}
	
	public boolean changePassword() throws IOException
	{
		boolean testResult = false;
		
		try
		{
			buttonProfileIcon.click();
			ExtentReportHelper.logInfo("Clicked on profile icon.");
			buttonChangePassword.click();
			ExtentReportHelper.logInfo("Selected 'Change Password' option from profile icon.");
			textBoxCurrentPassword.sendKeys("admin123");
			ExtentReportHelper.logInfo("Entered Current Password.");
			textBoxNewPassword.sendKeys("admin123");
			ExtentReportHelper.logInfo("Entered New Password.");
			textBoxConfirmPassword.sendKeys("admin123");
			ExtentReportHelper.logInfo("Entered Confirm Password.");
			
			buttonSave.click();
			ExtentReportHelper.logInfo("Clicked Save button.");
			
			if(msgSuccess.size() > 0)
			{
				ExtentReportHelper.logPass("Password changed successfully.");
				testResult = true;
			}
			else
				ExtentReportHelper.logFail("Unable to locate the toaster message.");
		}
		catch (Exception ex) 
		{
			ExtentReportHelper.logFail("Exception in method 'changePassword' : "+ ex.getMessage());
			return false;
		}
		return testResult;
	}

	
}
