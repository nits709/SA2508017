package testNG_Demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class TNG_11_Parallel_Execution {

	@Test
	public void testFacebook() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		System.out.println("getTitle " + driver.getTitle());
		driver.close();

	}

	@Test
	public void testMyntra() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://myntra.com");
		System.out.println("getTitle " + driver.getTitle());
		driver.close();
	}

	@Test
	public void testGoogle() {
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		System.out.println("getTitle " + driver.getTitle());
		driver.close();
	}

	@Test
	public void testAmazon() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		System.out.println("getTitle " + driver.getTitle());
		driver.close();
	}

}
