package Session_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_Assignment_04 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://facebook.com");

		WebElement username = driver.findElement(By.className("_55r1"));
		username.sendKeys("ntin@gmail.com");
	}

}
