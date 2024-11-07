package test_script;

public class NavigationCommands extends Base
{
	public void navigateCommands()
	{
		driver.navigate().to("https://www.amazon.in/");   // To navigate to another page from prevoius page
		driver.navigate().back(); // To go back to the previous page
		driver.navigate().forward(); // To navigate to next page
		driver.navigate().refresh();  // To refresh page
	}

	public static void main(String[] args) 
	{
		NavigationCommands nav=new NavigationCommands();
		nav.initializeBrowser();
		nav.navigateCommands();
	}
}
