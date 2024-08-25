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
		driver.get("https://demoqa.com/droppable"); // url hit
		Thread.sleep(4000);

		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@class='simple-drop-container']//div[@id='droppable']"));

		//  scroll 
		JavascriptExecutor js = (JavascriptExecutor) driver; // typecasting
		js.executeScript("arguments[0].scrollIntoView();", drop);
		
		
		// Javascript Click - 
		
//		js.executeScript("arguments[0].click();", WebElementToClick);
		js.executeScript("arguments[0].click();", drop);
		

	}

}
