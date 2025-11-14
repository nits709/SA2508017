package WebDriver_Actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import Utility.baseFunction;

public class SA_29_HandlingConfirmation_Alert extends baseFunction {

	public static void main(String[] args) {

		launchBrowser(bName);
		launchURL("https://demoqa.com/alerts");

		Alert alt;

		driver.findElement(By.id("confirmButton")).click();

		alt = driver.switchTo().alert();

		alt.dismiss(); // click on cancel button

		// alt.accept() // click on ok button

		System.out.println("capture text for validation " + driver.findElement(By.id("confirmResult")).getText());

		driver.close();

	}

}
