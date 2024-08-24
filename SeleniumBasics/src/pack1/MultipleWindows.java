package pack1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // url hit

		Thread.sleep(4000);

		String mainWindow = driver.getWindowHandle();
		System.out.println("mainWindow : " + mainWindow);

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		System.out.println();

		Set<String> allWins = driver.getWindowHandles();

		for (String win : allWins)
		{
			System.out.println(win);

			if (!(win.equals(mainWindow)))
			{
				driver.switchTo().window(win);  // switch to the given window
			}
		}

		String currentWin = driver.getWindowHandle();  // window handle of currently focused window
		System.out.println("Switched to : "+currentWin);
		
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']"));
		ele.sendKeys("abcd");

	}

}
