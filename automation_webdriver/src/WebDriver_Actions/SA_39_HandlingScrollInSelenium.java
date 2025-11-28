package WebDriver_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utility.baseFunction;

public class SA_39_HandlingScrollInSelenium extends baseFunction {

	public static void main(String[] args) throws InterruptedException {

		launchBrowser(bName);
		launchURL("https://omayo.blogspot.com/");

		// x,y starts from 0,0 --> 0,500
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,2000)"); // from top to Down 0 to 2000
//
//		js.executeScript("window.scrollBy(0,-500)"); // from bottom to top by -500

		Thread.sleep(3000);

		// 3. Scroll to the Top
		// js.executeScript("window.scrollTo(0,0)");

		// 4. scroll towards the bottom
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		// 5. scroll to specific function.

		WebElement checkThis = driver.findElement(By.xpath("//*[text()='Check this']"));
		js.executeScript("arguments[0].scrollIntoView(true)", checkThis);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
