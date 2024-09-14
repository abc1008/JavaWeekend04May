package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page"); // url hit

		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='day']")).click();
		List<WebElement> days = driver.findElements(By.xpath("//select[@id='day']//option"));

		for (WebElement day : days)
		{
			String dayText = day.getText(); // return the text from given webelement
//			     System.out.println(dayText);

			if (dayText.equals("15"))
			{
				day.click();
				break;
			}
		}

		WebElement monthDropdown = driver.findElement(By.id("month"));

		Select sel = new Select(monthDropdown);

//		 sel.selectByIndex(4);   
//		 sel.selectByValue("6");
		sel.selectByVisibleText("Nov");

		String selectedOption = sel.getFirstSelectedOption().getText(); // to get the text from selected option
		System.out.println(selectedOption);

//		 Datepicker 2



	}

}
