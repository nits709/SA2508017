package seleniumwithmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myfirstScriptWithMVN {

	@Test
	public void launchApplication() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();

		driver.close();

	}
}
