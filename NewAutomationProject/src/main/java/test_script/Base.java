package test_script;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Base 
{
  public WebDriver driver; // Declaring driver as global 
  
  public void initializeBrowser() // Instance method to open browser and launch URL
  {
	  driver = new ChromeDriver(); // To open browser
	  driver.get("https://selenium.qabible.in/index.php"); // To launch URL get();
	  driver.manage().window().maximize(); // To maximize window
  }
  public void quickClose() // Instance method to close windows and browser
  {
	driver.close(); // To close current window  
	//driver.quit();  // To close all windows open after launching the site
  }
  

	public static void main(String[] args) 
	{
		Base obj=new Base(); // creating object 'obj' to the class 'Base'
		obj.initializeBrowser(); // invoking the method 'initializeBrowser()'
		obj.quickClose(); // invoking the method 'quickClose()'
	}
}
