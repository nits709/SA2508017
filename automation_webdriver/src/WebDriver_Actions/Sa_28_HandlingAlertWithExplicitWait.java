package WebDriver_Actions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.baseFunction;

public class Sa_28_HandlingAlertWithExplicitWait extends baseFunction {

	public static void main(String[] args) {

		launchBrowser(bName);
		launchURL("https://demoqa.com/alerts");

		Alert alt;

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.id("timerAlertButton")).click();

		wait.until(ExpectedConditions.alertIsPresent());
		

		alt = driver.switchTo().alert();

		System.out.println("alt text " + alt.getText());

		alt.accept();

		System.out.println("alert accepted.");

	}

}
