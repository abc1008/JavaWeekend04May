package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import basePack.BaseClass;

public class JSMethods extends BaseClass
{
	public static void scrollTo(WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver; // typecasting
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}
	
	public static void click(WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver; // typecasting
		js.executeScript("arguments[0].click();", ele);
	}

	
}
