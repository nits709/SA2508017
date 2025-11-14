package WebDriver_Actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import Utility.baseFunction;

public class SA_27_HandlingSimpleAlert extends baseFunction {

	public static void main(String[] args) {
		launchBrowser(bName);
		launchURL("https://demoqa.com/alerts");

		Alert alt;
		driver.findElement(By.id("alertButton")).click();

		// selenium control from application to alert
		// switchTo

		alt = driver.switchTo().alert();

		System.out.println("alert text - " + alt.getText());

		alt.accept(); // click on Ok button

		System.out.println("alert accepted");

	}

}
