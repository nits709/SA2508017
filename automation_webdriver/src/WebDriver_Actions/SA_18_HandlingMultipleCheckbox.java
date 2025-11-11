package WebDriver_Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.baseFunction;

public class SA_18_HandlingMultipleCheckbox extends baseFunction {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser(bName);
		launchURL("https://omayo.blogspot.com/");

//		driver.findElement(By.xpath("(//input[@value='Pen'])[2]")).click();
//		driver.findElement(By.xpath("//input[@value='Laptop']")).click();
//		driver.findElement(By.xpath("//input[@value='Bag']")).click();
//		driver.findElement(By.xpath("//input[@value='Book']")).click();
		
		
		List<WebElement> noCheckbox = driver.findElements(By.xpath("//input[@name='accessories']"));
		
		System.out.println("no of checkbox "+ noCheckbox.size());
		
		noCheckbox.get(0).click();  // Pen
		noCheckbox.get(3).click(); // Bag
		
		Thread.sleep(2000);
		
		quitBrowser();

	}
}
