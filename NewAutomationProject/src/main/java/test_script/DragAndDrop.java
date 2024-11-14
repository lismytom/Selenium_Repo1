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
		
		WebElement drg2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		actions.moveToElement(drg2);
		actions.doubleClick(drg2).perform();
		actions.dragAndDrop(drg2, destination).build().perform();
		
		WebElement drg3=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		actions.moveToElement(drg3);
		actions.doubleClick(drg3).perform();
		actions.dragAndDrop(drg3, destination).build().perform();
		
		WebElement drg4=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		actions.moveToElement(drg4);
		actions.doubleClick(drg4).perform();
		actions.dragAndDrop(drg4, destination).build().perform();		
	}

	public static void main(String[] args) 
	{
		DragAndDrop drganddrp = new DragAndDrop();
		drganddrp.initializeBrowser();
		drganddrp.dragAndDrop();
	}
}
