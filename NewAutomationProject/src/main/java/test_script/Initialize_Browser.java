package test_script;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Initialize_Browser 
{
	public static void main(String[] args) 
	{
	  //WebDriver driver=new ChromeDriver();
	 // WebDriver driver=new EdgeDriver();
	    WebDriver driver=new FirefoxDriver();
	}
}
