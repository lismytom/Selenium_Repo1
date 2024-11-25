package testScript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest extends Base{
  @Test
  public void verifyUserIsAbleToLoginValidCredenstials() throws AWTException
  {
	  LoginPage logpage = new LoginPage(driver);
	  logpage.enter_username_field("carol");
	  logpage.enter_password_field("1q2w3e4r");
	  logpage.click_login_btn();
	  boolean isHomepage_loaded=logpage.isDashboard_loaded();
	  assertTrue(isHomepage_loaded,"Home page not loaded with provided credentials");	  
  }
}
