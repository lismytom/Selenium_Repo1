package testScript;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import pages.ClientsPage;
import pages.LoginPage;

import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;

public class ClientsPageTest extends LoginPageTest
{
  @Test
  public void verifyUserIsAbleToSearchClientWithClientName()throws AWTException
  {
	  LoginPage logpage = new LoginPage(driver);
	  logpage.enter_username_field("carol");
	  logpage.enter_password_field("1q2w3e4r");
	  logpage.click_login_btn();
	  driver.get("https://www.qabible.in/payrollapp/client/index");
	  ClientsPage client = new ClientsPage(driver);
	  client.enter_clientname_field("Haritha");
	  client.click_search_btn();
	  client.click_reset_btn();
	  client.enter_clientID_field("110");
	  client.click_search_btn();
	  client.click_reset_btn();
	  client.enter_clientname_field("Lismy");
	  client.click_search_btn();
	  boolean isClientDetailsLoaded=client.isSearchDetailsisDisplayed();
	  assertTrue(isClientDetailsLoaded,"search item is not displayed");
	  
  }
  
}
