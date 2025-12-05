package WebDriver_Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import Utility.baseFunction;

public class RobotDemo extends baseFunction {

	public static void main(String[] args) {
		try {
			Robot rb = new Robot(); // inbuilt class from java to interact OS dialog box in automation.
			launchBrowser(bName);
			launchURL("https://sampleapp.tricentis.com/101/app.php");
			driver.findElement(By.linkText("Automobile")).click();
			driver.findElement(By.linkText("Enter Insurant Data")).click();

			driver.findElement(By.id("open")).click();

			Thread.sleep(5000);

			rb.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(5000);

			rb.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_DOWN);

			rb.keyPress(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
