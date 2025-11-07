package Session_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_Assignment_03 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");

		driver.findElement(By.className("form-control")).sendKeys("username");
		// driver.findElement(By.className("form-control")).sendKeys("password");
		driver.findElement(By.cssSelector("input[class='form-control'][id='txtPassword']")).sendKeys("password");
		driver.findElement(By.className("btn-primary")).click();

		driver.close();

	}
}
