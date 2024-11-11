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
	public void name_locator()
	{
		WebElement name=driver.findElement(By.name("viewport"));
	}
	public void class_locator()
	{
		WebElement class1=driver.findElement(By.className("header-top"));
	}
	public void css_selector()
	{
		//First combination- tag#id
		WebElement css1=driver.findElement(By.cssSelector("input#single-input-field"));
		//Second Combination -tag.class
		WebElement css2=driver.findElement(By.cssSelector("ul.navbar-nav"));
		WebElement css3=driver.findElement(By.cssSelector("a.navbar-brand"));
		// 3rd Combination - tag[attribute=value]
		WebElement css4=driver.findElement(By.cssSelector("input[id=single-input-field]"));
		WebElement css5=driver.findElement(By.cssSelector("input[placeholder=Message]"));
		// 4th combination = tag.class[attribute=value]
		WebElement css6=driver.findElement(By.cssSelector("input.form-control[placeholder=Message]"));
		WebElement css7=driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
	}
	public void absolute_xpath()
	{
		WebElement abpath1=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
	}
	public void relative_xpath()
	{
		WebElement rpath1=driver.findElement(By.xpath("//input[@placeholder='Message']"));
		WebElement rpath2=driver.findElement(By.xpath("//input[@fdprocessedid='kdbigp']"));
	}
	public static void main(String[] args) 
	{
		Locators loctr = new Locators();
		loctr.initializeBrowser();
		loctr.id_locator();
		loctr.name_locator();
		loctr.name_locator();
		loctr.class_locator();
		loctr.css_selector();
		loctr.absolute_xpath();
		loctr.relative_xpath();
	}
}
