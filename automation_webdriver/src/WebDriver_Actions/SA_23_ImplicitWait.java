package WebDriver_Actions;

import java.time.Duration;

import org.openqa.selenium.By;

import Utility.baseFunction;

public class SA_23_ImplicitWait extends baseFunction {

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

		driver.findElement(By.cssSelector("div[aria-label^='Lal Ghati']")).click();

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
