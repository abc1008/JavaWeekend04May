package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts"); // url hit
		Thread.sleep(2000);
		
		 WebElement clickButton = driver.findElement(By.id("timerAlertButton"));
		 
		JavascriptExecutor js = (JavascriptExecutor) driver; // typecasting
		js.executeScript("arguments[0].scrollIntoView();", clickButton);
		
		Thread.sleep(2000);
		clickButton.click();
//																								max waiting time
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		

	}
	
	
	
	
	
	

}
