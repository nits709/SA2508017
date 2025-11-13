package WebDriver_Actions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import Utility.baseFunction;

public class SA_25_FluentWait extends baseFunction {

	public static void main(String[] args) {
		launchBrowser(bName);
		launchURL("https://www.redbus.in/");

		// click on from element --> opens input field
		driver.findElement(By.xpath("//*[@id='root']/main/div/div/search/div/div/div/div[1]/div[1]/div/div")).click();

		// enter from field - Kolh
		driver.findElement(By.id("srcDest")).sendKeys("kolh");

		driver.findElement(By.cssSelector("div[aria-label^='Bus Stand']")).click();

		// To field
		driver.findElement(By.xpath("//*[@id='root']/main/div/div/search/div/div/div/div[1]/div[2]")).click();
		driver.findElement(By.id("srcDest")).sendKeys("Bho");

		FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver); // explicit wait.
		fWait.withTimeout(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class).pollingEvery(Duration.ofSeconds(2))
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[aria-label^='Lal Ghati']")))
				.click();
		// driver.findElement(By.cssSelector("div[aria-label^='Lal Ghati']")).click();

		// calendar
		driver.findElement(By.xpath("//*[@id='root']/main/div/div/search/div/div/div/div[1]/div[3]/div[1]/div"))
				.click();

		driver.findElement(By.xpath("//span[text()='30']")).click();
		driver.findElement(By.xpath("//button[text()='Search buses']")).click();

		String searchResult = driver.findElement(By.xpath("//*[@id='41802858']/div[1]/div[3]/div/div[1]/div[1]"))
				.getText();
		System.out.println("Search Result -> " + searchResult);

		driver.close();
	}

}
