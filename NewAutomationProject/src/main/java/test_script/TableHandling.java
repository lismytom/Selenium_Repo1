package test_script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base
{
	public void fullTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
	}
	
	public void tableRow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));
		System.out.println(row.getText());
	}
	
	public void particularValue()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement val = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[1]"));
		System.out.println(val.getText());
	}
	
	public void tableColumn()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[4]"));
		for (WebElement elemnt:col)	
		{
			System.out.println(elemnt.getText());
		}
	}
	
	public void searchElement1()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input1="Tiger Nixon";
		List<WebElement> val1=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement element1:val1)
		{
			if (element1.getText().equals(input1))
			{
				System.out.println("Name available: "+element1.getText());
			}			
		}
	}
		public void searchElement2()
		{
			driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
			String input2="Software Tester";
			List<WebElement> val2=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
			for(WebElement element2:val2)
			{
				if (element2.getText().equals(input2))
				{
					System.out.println("Position available: "+element2.getText());
				}			
				else
				{
					System.out.println("Position not available");
				}
			}	
	}
	
	public static void main(String[] args) 
	{
		TableHandling tbl=new TableHandling();
		tbl.initializeBrowser();
		tbl.fullTable();
		System.out.println("******Row Data********");
		tbl.tableRow();
		System.out.println("******Particular Value********");
		tbl.particularValue();
		tbl.searchElement1();
		tbl.searchElement2();
		System.out.println("******Column Data********");
		tbl.tableColumn();
	}
}
