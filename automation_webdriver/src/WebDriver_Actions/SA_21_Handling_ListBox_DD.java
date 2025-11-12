package WebDriver_Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utility.baseFunction;

public class SA_21_Handling_ListBox_DD extends baseFunction {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser(bName);
		launchURL("https://omayo.blogspot.com/");

		Select sc = new Select(driver.findElement(By.id("multiselect1")));
		List<WebElement> multbox = sc.getOptions();
		System.out.println("no of options present in multbox -> " + multbox.size());
		for (WebElement mbox : multbox) {

			System.out.println("option from list box " + mbox.getText());
		}

		sc.selectByIndex(0); // volvo
		System.out.println("select option "+ multbox.get(0).getText());
		sc.selectByIndex(3); // Audi
		System.out.println("select option "+ multbox.get(3).getText());

		Thread.sleep(1000);
		
		sc.deselectAll(); // deselect all option from DD
		
		Thread.sleep(1000);
		
		sc.selectByIndex(2);// Hyndai
		System.out.println("select option "+ multbox.get(2).getText());
		
		Thread.sleep(1000);
		
		sc.deselectByIndex(2); // deselectHuyndai
		
		Thread.sleep(1000);

		quitBrowser();
	}

}
