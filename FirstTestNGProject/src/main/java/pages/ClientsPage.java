package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientsPage 
{
	public WebDriver driver;

	public ClientsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);  // class.method
	
	}
	 @FindBy(xpath="//input[@id='clientsearch-client_name']") WebElement clientName;
	 @FindBy(xpath="//input[@id='clientsearch-id']") WebElement clientID;
	 @FindBy(xpath="//button[@class='btn btn-primary']") WebElement search_btn;
	 @FindBy(xpath="//button[@class='btn btn-default']") WebElement reset_btn;
	 @FindBy(xpath="//table[@class='table table-striped table-bordered']/tbody/tr/td[2]")List <WebElement> clientid_column;
	 @FindBy(xpath="//table[@class='table table-striped table-bordered']/tbody/tr/td")List <WebElement> clientname_column;
	 @FindBy(xpath="//div[@class='empty']") WebElement invalidText;
	

	 public void enter_clientname_field(String clientNamefield)
	    {
		 clientName.sendKeys(clientNamefield);
	    }
	 public void click_search_btn()throws AWTException
	   {
		search_btn.click();
		Robot robot=new Robot();
		robot.delay(1200);
	   }
	 public void enter_clientID_field(String clientIDfield)
	    {
		 clientID.sendKeys(clientIDfield);
	    }
	 public void click_reset_btn()throws AWTException
	   {
		 clientName.clear();
		 clientID.clear();
		 Robot robot=new Robot();
		 robot.delay(1200);
	   }
		 public boolean isSearchDetailsisDisplayed()
		{
			return search_btn.isDisplayed();
		}
}
