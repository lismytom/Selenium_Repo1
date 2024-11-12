package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Base
{
	public void selectColor()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectcolr=driver.findElement(By.id("single-input-field"));
		//selectcolr.click();
		Select dropdown = new Select(selectcolr);
		//dropdown.selectByVisibleText("Red");
		//dropdown.selectByIndex(1);
		dropdown.selectByValue("Red");
		
		
	}
	public static void main(String[] args) 
	{
		Dropdown dp = new Dropdown();
		dp.initializeBrowser();
		dp.selectColor();

	}

}
