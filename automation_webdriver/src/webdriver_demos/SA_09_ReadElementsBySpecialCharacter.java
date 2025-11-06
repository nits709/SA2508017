package webdriver_demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_09_ReadElementsBySpecialCharacter {

	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://facebook.com");

		WebElement username = driver.findElement(By.cssSelector("input[name='email'][id='email']"));
		username.sendKeys("user@gmail.com");

		WebElement password = driver.findElement(By.cssSelector("input[type='password'][data-testid='royal-pass']"));
		password.sendKeys("asdfdsa@");

		WebElement loginButton = driver.findElement(By.cssSelector("button[id^='u_0_5_']"));
		loginButton.click();
		
		driver.close();
	}
}
