package pom_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ChangePasswordPage
{
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
		PageFactory.initElements(driver, this);    // refer non-static variables of current class
	}
	
	
	// methods
	public void changePassword()
	{
		buttonProfileIcon.click();
		buttonChangePassword.click();
		textBoxCurrentPassword.sendKeys("admin123");
		textBoxNewPassword.sendKeys("admin123");
		textBoxConfirmPassword.sendKeys("admin123");
		
		buttonSave.click();
		
		if(msgSuccess.size() > 0)
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Unable to locate the toaster message.");
		}
		
		
	}

	
}