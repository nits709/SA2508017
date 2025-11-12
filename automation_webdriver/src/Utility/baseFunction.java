package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class baseFunction {

	public static WebDriver driver;
	public static String bName = "Chrome"; 

	public static void launchBrowser(String browserName) {

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

	}

	public static void launchURL(String applicationURL) {
		driver.get(applicationURL);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void quitBrowser() {
		driver.close();
	}

}
