package WebDriver_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.baseFunction;

public class SA_35_HandlingDragNDrop_Actions extends baseFunction {

	public static void main(String[] args) {
		launchBrowser(bName);
		launchURL("https://jqueryui.com/droppable/");
		Actions act = new Actions(driver);

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));

		act.dragAndDrop(drag, drop).build().perform();
		
		//driver.switchTo().parentFrame(); // from child iframe to parent iframe
		
		//driver.switchTo().defaultContent(); // from iframe to main page (webpage)
		
		
		
		//  whatever iframe are in from there i want to go back to main page (website)
		
		//driver.switchTo().defaultContent();
		
		
		// from child iframe , want to go back to parent iframe 
		//driver.switchTo().parentFrame();
		
		
		
		
		
		
	}

}
