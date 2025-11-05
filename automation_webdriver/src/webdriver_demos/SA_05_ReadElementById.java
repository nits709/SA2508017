package webdriver_demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_05_ReadElementById {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://facebook.com");

		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("asdfgh@gmail.com");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("asdfghjhgfdsa");

		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();

		Thread.sleep(2000);

		driver.close();

	}

}
