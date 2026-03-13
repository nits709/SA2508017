package keywordFunctions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		BaseLogic.test.info("Open " + appURL);
		BaseLogic.test.addScreenCaptureFromPath(captureScreenshot(driver, appURL));
	}

	public void type(String locator, String data) {
		driver.findElement(By.id(getValue(locator))).sendKeys(data);
		BaseLogic.test.info("Step Passed : click on " + locator + " and entered data " + data);
	}

	public void click(String locator) {
		driver.findElement(By.id(getValue(locator))).click();

		BaseLogic.test.info("Step Passed : click on " + locator);

	}

	public void verifyText(String locator) {
		String actualText = driver.findElement(By.xpath(getValue(locator))).getText();
		driver.findElement(By.xpath(getValue(locator))).getText();
		System.out.println("Actual text " + actualText);
		Assert.assertEquals(actualText, getValue("LoginMsg"), "Verification text are not matched , please verify");
	}

	public void closeBrowser() {
		driver.quit();
	}
	
	public static String captureScreenshot(WebDriver driver, String stepName) {

        String timeStamp =
                new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

        String path = "src/test/java/screenshots/" + stepName + "_" + timeStamp + ".png";

        File src = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);

        File dest = new File(path);

        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return path;
    }

}
