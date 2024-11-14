package test_script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements extends Base
{
	public void findElements()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> msgfield=driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement msg1:msgfield)
		{
		msg1.sendKeys("Hello");
		}				
	}

	public static void main(String[] args) 
	{
		FindElements msg_obj= new FindElements();
		msg_obj.initializeBrowser();
		msg_obj.findElements();
		
	}

}
