package WebDriver_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SA_26_ChromeOptions_Methods {

	public static void main(String[] args) {

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--headless");
//		op.addArguments("--incognito");
//		op.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(op);
		// driver.manage().window().maximize();
		driver.get("https://google.co.in");
		System.out.println("Title of page " + driver.getTitle());
	}

}
