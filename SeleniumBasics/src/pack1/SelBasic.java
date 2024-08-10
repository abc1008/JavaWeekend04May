package pack1;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SelBasic
{
	static WebDriver driver;   // null 
	
	public static void main(String[] args) throws InterruptedException
	{
		String browser = "CHROME";
		
		if(browser.equals("CHROME"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equals("EDGE"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Incorrect Browser");
		}
		
		// *** Basic Operations ****
		
		driver.manage().window().maximize();  // maximize browser
		
		Thread.sleep(2000);
		driver.get("https://www.google.com");  // url hit
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com");
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);   
		driver.navigate().refresh();
		
		
		  String title = driver.getTitle();
		   
		System.out.println(title);
		
		if(title.contains("Facebook"))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
		
	}
	
	

}
