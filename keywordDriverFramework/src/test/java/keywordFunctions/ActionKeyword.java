package keywordFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utility.propReader;

public class ActionKeyword extends propReader {

	public WebDriver driver;

	public void openBrowser(String value) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void navigate(String appURL) {
		driver.get(appURL);
	}

	public void type(String locator, String data) {
		driver.findElement(By.id(getValue(locator))).sendKeys(data);
	}

	public void click(String locator) {
		driver.findElement(By.id(getValue(locator))).click();
	}

	public void verifyText(String locator) {
		String actualText = driver.findElement(By.xpath(getValue(locator))).getText();
							driver.findElement(By.xpath(getValue(locator))).getText();
		System.out.println("Actual text "+ actualText);
		Assert.assertEquals(actualText, getValue("LoginMsg"), "Verification text are not matched , please verify");
	}

	public void closeBrowser() {
		driver.quit();
	}

}
