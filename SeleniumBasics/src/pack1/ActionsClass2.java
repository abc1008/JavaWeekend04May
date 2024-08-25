package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass2
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/"); // url hit
		Thread.sleep(1000);
		
		
//		Mouse Hover
		
		  WebElement mp3Player = driver.findElement(By.xpath("//a[text()='MP3 Players']"));
		
		  Actions act = new Actions(driver);
		  
		  act.moveToElement(mp3Player).perform();  // hover
		  
		  Thread.sleep(2000);
		  
		  WebElement allMp3 = driver.findElement(By.xpath("//a[@class='see-all' and text()='Show AllMP3 Players']"));
		
		  act.click(allMp3).perform();
		  
		  
		  
		  
		
	}
	
	
	

}
