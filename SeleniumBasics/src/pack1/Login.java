package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login"); // url hit
		
		Thread.sleep(2000);
		
		
		WebElement userId = driver.findElement(By.id("input-email"));  // locate WebElement
		userId.sendKeys("ag89111@gmail.com");       // perform operation
		
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Login@123");
//		 password.sendKeys("Login@123");
		  
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
		 
		 
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='My Account']")).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Logout")).click();
		
	}

}
