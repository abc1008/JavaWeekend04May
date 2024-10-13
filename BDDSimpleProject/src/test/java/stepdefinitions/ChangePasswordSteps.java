package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import orangeHRMObjects.OrangeHRMApp;
import pom_pages.ChangePasswordPage;

public class ChangePasswordSteps
{
	
	@Given("User clicks on profile icon")
	public void clickProfileIcon()
	{
		OrangeHRMApp.changePasswordPage().clickProfileIcon();
	}
	
	@When("Selects 'Change Password' option")
	public void selectOption()
	{
		OrangeHRMApp.changePasswordPage().selectChangePassword();
	}
	
	@And("Enters new passwords")
	public void enterAllPasswords()
	{
		OrangeHRMApp.changePasswordPage().enterPassword();
	}
	
	@And("Clicks on Save button")
	public void clickSave()
	{
		OrangeHRMApp.changePasswordPage().clickSave();
	}

	@Then("Password should be changed successfully and a toaster message should be dispalyed")
	public void verifyToaster()
	{
		OrangeHRMApp.changePasswordPage().clickSave();
	}
	
}
