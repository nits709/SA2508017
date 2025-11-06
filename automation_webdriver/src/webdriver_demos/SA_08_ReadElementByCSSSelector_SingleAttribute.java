package webdriver_demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_08_ReadElementByCSSSelector_SingleAttribute {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		WebElement username =driver.findElement(By.cssSelector("input[name='email']"));
		username.sendKeys("user@gmail.com");
		
		WebElement password =driver.findElement(By.cssSelector("input[type='password']"));
		password.sendKeys("asdfdsa@");
		
		WebElement loginButton = driver.findElement(By.cssSelector("button[name='login']"));
		loginButton.click();

	}

}
