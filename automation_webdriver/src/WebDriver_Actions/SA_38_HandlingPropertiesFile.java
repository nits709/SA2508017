package WebDriver_Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SA_38_HandlingPropertiesFile {

	String fileName = "/Volumes/Renuka/Professional Stuff (Restricted)/"
			+ "Session_material/Session_WorkSpaces/SA2508017_Workspace/" + "WebDriver_Module/automation_webdriver/"
			+ "mypropertiesFile.properties";

	Properties prop;
	WebDriver driver;

	@BeforeTest
	public void setupPropertiesObject() throws IOException {
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file); // checked exception.
		prop = new Properties();
		prop.load(fis);
	}

	@BeforeMethod
	public void setupBrowser() {
		driver = new ChromeDriver();
		driver.get(prop.getProperty("app_URL"));
		System.out.println("Application URL " + prop.getProperty("app_URL"));
	}

	@Test
	public void loginApplicationWithValidData() throws IOException {
		driver.findElement(By.id(prop.getProperty("username_id"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id(prop.getProperty("password_id"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id(prop.getProperty("login_id"))).click();
		System.out.println("loginSuccessfully "
				+ driver.findElement(By.xpath(prop.getProperty("Login_Successfully_text_xpath"))).getText());
		captureScreenShot();

		driver.findElement(By.xpath(prop.getProperty("Login_Successfully_text_xpath"))).click();

	}

	public void captureScreenShot() throws IOException {

		File captureFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // that take screenshot
		FileHandler.copy(captureFile, new File("Selenium.jpeg"));
		System.out.println("screen shot captured!");

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
