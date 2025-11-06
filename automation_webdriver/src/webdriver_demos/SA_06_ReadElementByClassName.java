package webdriver_demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_06_ReadElementByClassName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://google.co.in");

		WebElement googleSearchField = driver.findElement(By.className("gLFyf"));

		// below line of code will open suggest list in googlepage
		googleSearchField.sendKeys("selenium");
		
		// work around if normal click is not working on submit button
		//googleSearchField.sendKeys(Keys.ENTER); // this will hit enter button.
		
		// below line of code may or may not work.
		WebElement seachButton = driver.findElement(By.className("gNO89b"));
		seachButton.click();

	}
}
