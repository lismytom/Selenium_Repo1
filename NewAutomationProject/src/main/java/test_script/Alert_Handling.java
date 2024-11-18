package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alert_Handling extends Base
{
	public void alertBox()
	{
		driver.navigate().to("https://selenium.qabible.in/bootstrap-alert.php");
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
        WebElement alertBox=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
        alertBox.click();   
        driver.switchTo().alert().accept(); // Switching to the alert box from main screen, alert().accept(); for selecting ok button
        System.out.println(alertBox.isDisplayed()); 
	}
	
	public void confirmBox()
	{
		driver.navigate().to("https://selenium.qabible.in/bootstrap-alert.php");
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement confirmBox = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		confirmBox.click();
		//driver.switchTo().alert().accept();  // for selecting ok button
		driver.switchTo().alert().dismiss(); // for selecting cancel button	
		System.out.println(confirmBox.isDisplayed()); 
	}
	
	public void propmtBox()
	{
		driver.navigate().to("https://selenium.qabible.in/bootstrap-alert.php");
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement promptBox=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		promptBox.click();
		driver.switchTo().alert().sendKeys("Sample");// Sending value to the alert pop up text box
		driver.switchTo().alert().accept();
		System.out.println(promptBox.isDisplayed()); 
	}
	
	public static void main(String[] args) 
	{
		Alert_Handling alrt = new Alert_Handling();
		alrt.initializeBrowser();
		alrt.alertBox();
		alrt.confirmBox();
		alrt.propmtBox();
	}
}
