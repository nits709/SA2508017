package testNG_Demos;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.baseFunction;

public class TNG_dataProviderDemo extends baseFunction {

	@Test(dataProvider = "supplyData")
	public void loginApplicationWithValidData(String username, String password) {
		launchBrowser(bName);
		launchURL("https://practicetestautomation.com/practice-test-login");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submit")).click();
		System.out.println("loginSuccessfully "
				+ driver.findElement(By.xpath("//*[@id='loop-container']/div/article/div[2]/p[1]/strong")).getText());

		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
		quitBrowser();
	}

	@DataProvider
	public Object[][] supplyData() {

		Object[][] data = new Object[4][2];

		// data row 1

		data[0][0] = "student";
		data[0][1] = "Password123";

		data[1][0] = "student";
		data[1][1] = "Password123";

		data[2][0] = "student";
		data[2][1] = "Password123";

		data[3][0] = "student";
		data[3][1] = "Password123";

		return data;
	}

}
