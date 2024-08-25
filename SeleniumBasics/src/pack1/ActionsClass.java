package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html"); // url hit
		Thread.sleep(4000);
		
		
		// Right Click 
		 WebElement rightClickEle = driver.findElement(By.xpath("//span[text()='right click me']"));
		 
		 Actions act = new Actions(driver);
//		 act.contextClick(rightClickEle).perform();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='Cut']")).click();
		
		
		// double Click 
		
		  WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		  act.doubleClick(doubleClick).perform();
		  
		  
//		  Mouse Hover.
		  
		  
		
	}
	
	
	

}
