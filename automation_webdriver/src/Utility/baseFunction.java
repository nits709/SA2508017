package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class baseFunction {

	public static WebDriver driver;
	public static String bName = "Chrome";

	public static void launchBrowser(String browserName) {

		if (browserName.equals("Chrome")) {
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--start-maximized");
			driver = new ChromeDriver(op);
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

	}

	public static void launchURL(String applicationURL) {
		driver.get(applicationURL); // 30 seconds
		// URL
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		// elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void quitBrowser() {
		driver.close();
	}

}
