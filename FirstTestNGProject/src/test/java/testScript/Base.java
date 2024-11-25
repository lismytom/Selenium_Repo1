package testScript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Base
{
	
 public WebDriver driver;
   @BeforeMethod
  public void beforeMethod() 
  {
	  driver = new ChromeDriver();
	  driver.get("https://www.qabible.in/payrollapp/site/login");
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
  }

}
