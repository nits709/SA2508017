package Browser_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_04_ReadElementByName {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://facebook.com");

		WebElement username = driver.findElement(By.name("email"));

		// enter the testdata into thetext field - SendKeys
		username.sendKeys("nitin@gmail.com");

		WebElement password = driver.findElement(By.name("pass"));

		password.sendKeys("qwertyuioiuytrew");

		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();

		Thread.sleep(2000); // checked exception | Compiltime exception

		driver.close();
	}

}
