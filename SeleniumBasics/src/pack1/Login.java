package pack1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import utility.CaptureScreen;
import utility.ConfigReader;
public class Login
{
	@Test
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String url = ConfigReader.readData("TestSiteUrl");
		driver.get(url); // url hit

		Thread.sleep(2000);

		WebElement userId = driver.findElement(By.id("input-email")); // locate WebElement
		userId.sendKeys(ConfigReader.readData("UserID")); // perform operation

		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(ConfigReader.readData("Password"));
//		 password.sendKeys("Login@123");

		Thread.sleep(2000); // click on login button
		driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='My Account']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click(); // logout click

		List<WebElement> logoutMsg = driver.findElements(By.xpath("//h1[text()='Account Logout']"));

	   String actualText = logoutMsg.get(0).getText();
		
		Assert.assertEquals(actualText, "User has been logged out successfully.");

		
		
		
//		if (logoutMsg.size() > 0)
//		{
//			System.out.println("Logout Successful");
//		} 
//		else
//		{
//			System.out.println("Logout Failed");
//
//			// screenshot
////			TakesScreenshot screen = (TakesScreenshot) driver; // typecsting
////			File screenShot = screen.getScreenshotAs(OutputType.FILE); // taking screenshot
////			File path = new File("D:\\Trainings\\TESTOMETER\\Seleniun_JAVA_04May24_WEEKEND\\TestScreenshots\\test.png");
////			Files.copy(screenShot, path);
//
////			String fileName = "File1" + DateTimeStamp;
//
//			CaptureScreen.printScreen(driver, "File1");
//
//		}

	}

}
