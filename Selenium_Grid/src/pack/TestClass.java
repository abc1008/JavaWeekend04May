package pack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestClass
{

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		
		ChromeOptions options = new ChromeOptions();
		String url = "http://localhost:32768/";
		WebDriver driver = new RemoteWebDriver(new URL(url), options);
		
		
		driver.get("https://www.google.com/");
		System.out.println("Tile of Page is : "+driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.quit();
		System.out.println("Browser Closed");
		
		
		
		
		
		
		
	}
	
	
	
	
	
}


