package pack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html"); // url hit
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@onClick='alertbox()']")).click();
		Thread.sleep(2000);

		Alert popup = driver.switchTo().alert(); // click OK
		popup.accept();

		Thread.sleep(2000); // 2nd popup handling
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onClick='confirmbox()']")).click();

		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();  // click Cancel 

	}

}
