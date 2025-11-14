package WebDriver_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_31_HandlingBrowsermethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// driver.get("https://google.co.in");

		driver.navigate().to("https://google.co.in");

		driver.get("https://facebook.com");

		driver.manage().window().maximize();

		driver.findElement(By.linkText("About")).click();
		System.out.println("About " + driver.getTitle());

		driver.navigate().back();

		Thread.sleep(1000);

		System.out.println("Google " + driver.getTitle());

		driver.navigate().forward();

		Thread.sleep(1000);
		System.out.println("About " + driver.getTitle());

		driver.navigate().refresh();

		driver.close();
	}
}
