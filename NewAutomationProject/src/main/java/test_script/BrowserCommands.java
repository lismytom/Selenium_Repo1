package test_script;

public class BrowserCommands extends Base
{
    public void browser_commands() 
    {
	   String title = driver.getTitle();  // To get the page title
	   System.out.println(title);
	   String url = driver.getCurrentUrl();// To get the current page URL 
       System.out.println(url); 
       String page_source = driver.getPageSource();// To get the page source code
       System.out.println(page_source);
    }
	public static void main(String[] args) 
	{
		BrowserCommands browse=new BrowserCommands();
		browse.initializeBrowser();
		browse.browser_commands();
	}
}
