package Browser_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_07_WritingWebElement_MultipleApproach {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://facebook.com");

		driver.findElement(By.id("email")).sendKeys("asdfgh@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("asdfghjhgfdsa");

		driver.findElement(By.name("login")).click();

	}
}
