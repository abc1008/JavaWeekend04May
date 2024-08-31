package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/"); // url hit

		Thread.sleep(2000);

		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3); // switch to iframe

		WebElement text3 = driver.findElement(By.xpath("//input[@name='mytext3']"));
		text3.sendKeys("abcd");

		Thread.sleep(3000);
		// frame4

		driver.switchTo().defaultContent();// switch to main web page

		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4); // switch to iframe

		WebElement text4 = driver.findElement(By.xpath("//input[@name='mytext4']"));
		text4.sendKeys("pqrs");

		// radio button in iframe inside frame:

		Thread.sleep(3000);
		driver.switchTo().defaultContent();

		driver.switchTo().frame(frame3);

		WebElement radioBtnIFrame = driver
				.findElement(By.xpath("//iframe[contains(@src,'https://docs.google.com/forms/d')]"));
		driver.switchTo().frame(radioBtnIFrame);

		WebElement radioBtn = driver.findElement(By.xpath("//div[@id='i5']"));
		radioBtn.click();

		// frame 3 2nd time

//		driver.switchTo().defaultContent();
//		driver.switchTo().frame(frame3);   // switch to iframe

		Thread.sleep(2000);
		driver.switchTo().parentFrame(); // switch to parent iframe of currently focused frame
		text3.clear();
		text3.sendKeys("xyz");

	}

}
