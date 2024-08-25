package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass3
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable"); // url hit
		Thread.sleep(1000);
		
		
//		Mouse Hover
		
		  WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		  WebElement drop = driver.findElement(By.xpath("//div[@class='simple-drop-container']//div[@id='droppable']"));
		
		
		  Actions act = new Actions(driver);
		  
		  act.clickAndHold(drag).moveToElement(drop).click().build().perform();  // drag and drop
		  
		  
		  
		  
		
	}
	
	
	

}
