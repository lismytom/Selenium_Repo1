package pages;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);  // class.method
	}
    @FindBy(id="loginform-username") WebElement username;
    @FindBy(id="loginform-password") WebElement password;
    @FindBy(xpath="//button[@type='submit']") WebElement loginbtn;
    @FindBy(xpath="//a[@href='/payrollapp/site/index']") WebElement dashboard1;
    public void enter_username_field(String usernamefiled)
    {
	 username.sendKeys(usernamefiled);
    }
    public void enter_password_field(String passwordfield)
   {
	password.sendKeys(passwordfield);
   }
   public void click_login_btn()throws AWTException
   {
	loginbtn.click();
	Robot robot=new Robot();
	robot.delay(1200);
   }
   public boolean isDashboard_loaded()
   {
     return dashboard1.isDisplayed();
   }
}
