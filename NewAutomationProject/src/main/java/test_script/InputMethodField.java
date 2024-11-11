package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputMethodField extends Base
{
	public void showMessage()
	{
		WebElement input_form=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		input_form.click();
		WebElement msg_txtbox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		msg_txtbox.sendKeys("Hello World");
		WebElement showmessage_btn=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessage_btn.click();
	}
	public void displaySum()
	{
		WebElement val_a=driver.findElement(By.xpath("//input[@id='value-a']"));
		val_a.sendKeys("25");
		WebElement val_b=driver.findElement(By.xpath("//input[@id='value-b']"));
		val_b.sendKeys("35");
		WebElement getTotal_btn=driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotal_btn.click();	
	} 
	public static void main(String[] args) 
	{
		InputMethodField input1=new InputMethodField();
		input1.initializeBrowser();
		input1.showMessage();
		input1.displaySum();	
	}
}
