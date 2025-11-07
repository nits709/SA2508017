package webdriver_demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA13_ReadElementByRealtiveXpath {

	// tagname[@attribute='value']
	// *[@name='email']
	// input[@name='pass']
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://facebook.com");

		WebElement username = driver.findElement(By.xpath("//*[@name='email']"));
		username.sendKeys("nitin@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
