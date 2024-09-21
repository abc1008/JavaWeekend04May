package pack1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginSelenium
{
	static WebDriver driver;
	
	@BeforeMethod
	public void login()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit wait
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // url hit

//		Thread.sleep(4000);
		WebElement userId = driver.findElement(By.xpath("//input[@name='username']")); // locate WebElement
		userId.sendKeys("Admin"); // perform operation

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test
	public void changePassword()
	{
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();   // profile icon
		
//		 Change Password code
	
		WebElement changePass = driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']//a[text()='Change Password']"));   
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(changePass));
		
		changePass.click();
		
		WebElement titleChangePass = driver.findElement(By.xpath("//h6[text()='Update Password']"));   
		
		wait.until(ExpectedConditions.visibilityOf(titleChangePass));
		
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("admin123");   // change password
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("admin123");
		
		driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("admin123");
		
		
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();   // Save click
		
		List<WebElement> successMsg = driver.findElements(By.xpath("//div[@id='oxd-toaster_1']//div//p[contains(@class,'toast-titlettt')]"));   
		
//		if(successMsg.size() > 0)
//		{
			String msg = successMsg.get(0).getText();
			System.out.println("Test Case Pass");
			Assert.assertEquals(msg, "Successrr");
			
//		}
//		else
//		{
//			System.out.println("Unable to locate the toaster message.");
//		}
		
		
		
		
		
	}
	
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();   // profile icon
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();   // profile icon
	}
	
	
}
