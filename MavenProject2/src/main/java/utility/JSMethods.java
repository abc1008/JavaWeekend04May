package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class JSMethods
{
	public static void scrollTo(WebElement ele, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver; // typecasting
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}
	
	public static void click(WebElement ele, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver; // typecasting
		js.executeScript("arguments[0].click();", ele);
	}

	
}
