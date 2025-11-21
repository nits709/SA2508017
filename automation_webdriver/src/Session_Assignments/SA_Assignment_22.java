package Session_Assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.baseFunction;

public class SA_Assignment_22 extends baseFunction {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("Firefox");
		Set<String> window = driver.getWindowHandles();
		driver.get("https://demoqa.com/browser-windows");

		Thread.sleep(5000);

		// New window Message.
		driver.findElement(By.id("messageWindowButton")).click();

		
		Iterator<String> it = window.iterator();
		String mainWindow = it.next();
		String childWindow = it.next();
		System.out.println("Get id od main window : " + mainWindow + "Get id of child window : " + childWindow);
		driver.switchTo().window(childWindow);

		WebElement heading = driver.findElement(By.xpath("/html/body"));
		System.out.println("Text on childwindow:" + heading.getText());

	}

}
