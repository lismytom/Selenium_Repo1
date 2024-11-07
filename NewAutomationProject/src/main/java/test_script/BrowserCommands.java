package test_script;

public class BrowserCommands extends Base
{
    public void browser_commands() 
    {
	   String title = driver.getTitle();  // To identify the page title
	   System.out.println(title);
	   String url = driver.getCurrentUrl();
       System.out.println(url); // To get current URL 
       String page_source = driver.getPageSource();
       System.out.println(page_source);
    }
	public static void main(String[] args) 
	{
		BrowserCommands browse=new BrowserCommands();
		browse.initializeBrowser();
		browse.browser_commands();
	}
}
