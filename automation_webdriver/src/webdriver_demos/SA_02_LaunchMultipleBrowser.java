package webdriver_demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SA_02_LaunchMultipleBrowser {

	static WebDriver driver;
	static String browserName = "Chrome";

	public static void main(String[] args) {

		if (browserName.equals("Chrome")) {
			driver = new ChromeDriver();
			System.out.println("Chrome Launched");
		} else if (browserName.equals("Safari")) {
			driver = new SafariDriver();
			System.out.println("safari Launched");
		} else if (browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
			System.out.println("Firefox Launched");
		} else {
			driver = new EdgeDriver();
			System.out.println("Edge Launched");
		}

		driver.manage().window().maximize();
		launchURL("https:facebook.com");
		driver.close();

	}

	public static void launchURL(String url) {
		driver.get(url);
	}
}
