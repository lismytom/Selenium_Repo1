package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base
{
	public void id_locator()
	{
		//WebElement elementname=driver.findElement(By.locatorname("attribute value"));
		WebElement message=driver.findElement(By.id("single-input-field"));
		WebElement messagebtn=driver.findElement(By.id("button-one"));
		WebElement a=driver.findElement(By.id("value-a"));
		WebElement b=driver.findElement(By.id("value-b"));
		WebElement totalbtn=driver.findElement(By.id("button-two"));
	}
	public static void main(String[] args) 
	{
		Locators loctr = new Locators();
		loctr.initializeBrowser();
		loctr.id_locator();
	}
}
