package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker
{
	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html"); // url hit

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		
		Thread.sleep(2000);
		
		String dayToSelect = "8";
		int a = 0;
		 while(a == 0)
		 {
			 WebElement monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			  String text = monthYear.getText();
			   
			   if(text.equals("September 2023"))
			   {
				   System.out.println("Found");
				   break;
			   }
			   driver.findElement(By.xpath("//a[@title='Prev']")).click();
		 }
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='"+dayToSelect+"']")).click();
		 
		 
		 
		 
		 
		 

	}
}
