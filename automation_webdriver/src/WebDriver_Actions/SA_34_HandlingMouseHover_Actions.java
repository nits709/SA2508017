package WebDriver_Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.baseFunction;

public class SA_34_HandlingMouseHover_Actions extends baseFunction {

	public static void main(String[] args) throws InterruptedException {

		launchBrowser(bName);
		launchURL("https://www.istqb.in/");
		Actions ac = new Actions(driver);

//		WebElement specList = driver.findElement(By.linkText("SPECIALIST"));
//		ac.moveToElement(specList).build().perform();

		List<WebElement> allLinks = driver.findElements(By.xpath("//nav[@role='navigation']/ul/li"));

		System.out.println("no. of links " + allLinks.size()); // 8

		for (int i = 0; i < allLinks.size(); i++) {
			Thread.sleep(2000);
			ac.moveToElement(allLinks.get(i)).build().perform();

		}

		quitBrowser();
	}

}
