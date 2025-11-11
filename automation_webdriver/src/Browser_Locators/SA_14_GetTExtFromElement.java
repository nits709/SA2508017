package Browser_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_14_GetTExtFromElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://facebook.com");
		Thread.sleep(2000);
		String textfromElement = driver.findElement(By.cssSelector("a[id^='u_0_6_']")).getText();
		//String textfromElement = driver.findElement(By.xpath("//*[@id='login_link']/div/a")).getText();
		
		System.out.println("textfromElement --> "+ textfromElement);
	}
}
