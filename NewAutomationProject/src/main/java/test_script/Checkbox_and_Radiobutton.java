package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox_and_Radiobutton extends Base
{
	public void checkbox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement chk1= driver.findElement(By.xpath("//input[@id='gridCheck']"));
		chk1.click();
		System.out.println(chk1.isSelected());
	}
	
	public void radiobtn()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement rad1=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		rad1.click();
		System.out.println(rad1.isEnabled());
		//WebElement rad2=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		//rad2.click();
		//System.out.println(rad2.isEnabled());
		WebElement showVal=driver.findElement(By.xpath("//button[@id='button-one']"));
		showVal.click();				
	}
	
	public void textEnabled()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement txt1=driver.findElement(By.xpath("//input[@placeholder='Message']"));
		txt1.click();
		System.out.println(txt1.isEnabled());
	}

	public static void main(String[] args) 
	{
		Checkbox_and_Radiobutton chk=new Checkbox_and_Radiobutton();
		chk.initializeBrowser();
		chk.checkbox();
		chk.radiobtn();
		chk.textEnabled();

	}

}
