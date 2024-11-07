package learning;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Browser_Initialization
{
  public WebDriver driver; 
  
  public void initializeBrowser() 
  {
	  driver = new ChromeDriver(); 
	  driver.get("https://www.manoramaonline.com/"); 
	  driver.manage().window().maximize(); 
  }
  public void quickClose() 
  {
	driver.close(); 
	driver.quit();  
  }
  

	public static void main(String[] args) 
	{
		Browser_Initialization obj=new Browser_Initialization(); 
		obj.initializeBrowser(); 
		obj.quickClose();
	}
}

