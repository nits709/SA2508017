package webdriver_demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_11_ReadElementsByLinkText_and_ParitalLinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://google.co.in");

		// linkText
		// driver.findElement(By.linkText("About")).click();

		// partial link text
		driver.findElement(By.partialLinkText("Adver")).click();

		Thread.sleep(2000);

		driver.close();

	}

}
