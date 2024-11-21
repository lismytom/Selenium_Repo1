package test_script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass_NewTab 
{
	public WebDriver driver;
	public void newTab()throws AWTException
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}

	public static void main(String[] args) throws AWTException
	{
		RobotClass_NewTab newtab = new RobotClass_NewTab();
		newtab.newTab();
	}
}
