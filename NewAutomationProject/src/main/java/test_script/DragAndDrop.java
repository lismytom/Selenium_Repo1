package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends Base
{
	public void dragAndDrop()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drg1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(drg1);
		actions.doubleClick(drg1).perform();
		WebElement destination=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		actions.dragAndDrop(drg1, destination).build().perform();
		
	}

	public static void main(String[] args) 
	{
		DragAndDrop drganddrp = new DragAndDrop();
		drganddrp.initializeBrowser();
		drganddrp.dragAndDrop();

	}

}
