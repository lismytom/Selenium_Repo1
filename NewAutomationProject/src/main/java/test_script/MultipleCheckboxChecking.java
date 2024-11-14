package test_script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleCheckboxChecking extends Base
{
	public void multipleCheckbox()
	{	
			driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
			List<WebElement> multiselect=driver.findElements(By.xpath("//input[@class='check-box-list']"));
			for(WebElement chkbox:multiselect)
			{
				chkbox.click();
			}				
		}

	public static void main(String[] args) 
	{
		MultipleCheckboxChecking mutliselect = new MultipleCheckboxChecking();
		mutliselect.initializeBrowser();
		mutliselect.multipleCheckbox();
		
	}

}
