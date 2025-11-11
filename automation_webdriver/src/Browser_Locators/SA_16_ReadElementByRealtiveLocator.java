package Browser_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class SA_16_ReadElementByRealtiveLocator {

	// Relative Locator -- > left, right , above and below
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://facebook.com");

		// email field present above the password field
		WebElement emailID = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("pass")));
		emailID.sendKeys("asdsasdsasd");

		// password field present below emailID
		WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.name("email")));
		password.sendKeys("asdfdsasdf");

		driver.close();
	}

}
