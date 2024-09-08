package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSMethods
{

	public static void main(String[] args) throws InterruptedException
	{

		// Scroll

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form"); // url hit
		Thread.sleep(4000);

		WebElement radioBtn = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));

		//  scroll 
		JavascriptExecutor js = (JavascriptExecutor) driver; // typecasting
		js.executeScript("arguments[0].scrollIntoView();", radioBtn);
		
		Thread.sleep(3000);
		// Javascript Click - 
		js.executeScript("arguments[0].click();", radioBtn);
		
		
		
		

	}

}
