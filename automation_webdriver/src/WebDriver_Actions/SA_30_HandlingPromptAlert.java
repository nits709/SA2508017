package WebDriver_Actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import Utility.baseFunction;

public class SA_30_HandlingPromptAlert extends baseFunction {

	public static void main(String[] args) {
		launchBrowser(bName);
		launchURL("https://demoqa.com/alerts");

		Alert alt;

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click()", driver.findElement(By.id("promtButton")));

		alt = driver.switchTo().alert();

		alt.sendKeys("selenium");
		alt.accept();

		String catpureText = driver.findElement(By.id("promptResult")).getText();

		System.out.println("captureText " + catpureText);

		driver.close();

	}

}
