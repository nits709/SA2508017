package WebDriver_Actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.baseFunction;

public class SA_36_HandlingRight_Double_Click extends baseFunction {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser(bName);
		launchURL("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(driver);

		// use for right click
		// WebElement righClick =
		// driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));

		// does right click on element - Approach-1
		// act.moveToElement(righClick).contextClick().build().perform();

		// apporach- 2
		// act.contextClick(righClick).build().perform();

		// below element is use for double click action.
		WebElement dublCLick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.moveToElement(dublCLick).doubleClick().build().perform();

		Alert alt = driver.switchTo().alert();

		System.out.println("get text from alert " + alt.getText());

		alt.accept();

		Thread.sleep(2000);

		quitBrowser();
	}

}
