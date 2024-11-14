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
		//Actions actions2=new Actions(driver);
		actions.moveToElement(drg2);
		actions.doubleClick(drg2).perform();
		//WebElement destination2=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		actions.dragAndDrop(drg2, destination).build().perform();
		WebElement drg3=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		Actions actions3=new Actions(driver);
		actions3.moveToElement(drg3);
		actions3.doubleClick(drg3).perform();
		WebElement destination3=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		actions.dragAndDrop(drg3, destination3).build().perform();
		WebElement drg4=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		Actions actions4=new Actions(driver);
		actions4.moveToElement(drg4);
		actions4.doubleClick(drg4).perform();
		WebElement destination4=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		actions.dragAndDrop(drg4, destination4).build().perform();
		
	}

	public static void main(String[] args) 
	{
		DragAndDrop drganddrp = new DragAndDrop();
		drganddrp.initializeBrowser();
		drganddrp.dragAndDrop();

	}

}
