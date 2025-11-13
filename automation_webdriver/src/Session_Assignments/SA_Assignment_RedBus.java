package Session_Assignments;

import org.openqa.selenium.By;

import Utility.baseFunction;

public class SA_Assignment_RedBus extends baseFunction {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser(bName);
		launchURL("https://www.redbus.in/");

		// click on from element --> opens input field
		driver.findElement(By.xpath("//*[@id='root']/main/div/div/search/div/div/div/div[1]/div[1]/div/div")).click();

		// enter from field - Kolh
		driver.findElement(By.id("srcDest")).sendKeys("kolh");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div[aria-label^='Bus Stand']")).click();

		Thread.sleep(2000);
		// To field
		driver.findElement(By.xpath("//*[@id='root']/main/div/div/search/div/div/div/div[1]/div[2]")).click();
		driver.findElement(By.id("srcDest")).sendKeys("Bho");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div[aria-label^='Lal Ghati']")).click();

		// calendar
		driver.findElement(By.xpath("//*[@id='root']/main/div/div/search/div/div/div/div[1]/div[3]/div[1]/div"))
				.click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='30']")).click();
		driver.findElement(By.xpath("//button[text()='Search buses']")).click();

		Thread.sleep(2000);
		String searchResult = driver.findElement(By.xpath("//*[@id='41802858']/div[1]/div[3]/div/div[1]/div[1]"))
				.getText();
		System.out.println("Search Result -> " + searchResult);

		driver.close();

	}

}
