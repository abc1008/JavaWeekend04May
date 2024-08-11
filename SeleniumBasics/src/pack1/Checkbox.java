package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/checkboxes"); // url hit
		
		Thread.sleep(2000);
		
		 WebElement chkbx1 =  driver.findElement(By.id("checkbox1"));
		
		 chkbx1.click();  
		 
		 Thread.sleep(2000);
		 
		 WebElement chkbx2 =  driver.findElement(By.id("checkbox2"));
		 
//		  boolean isChecked = chkbx2.isSelected();
//		  System.out.println(isChecked);
		  
		  if(chkbx1.isSelected() == false)
		  {
			  chkbx1.click();
		  }
		  else if(chkbx2.isSelected() == true)
		  {
			  chkbx2.click();
		  }
		 
	}
	
	
	
	


}
