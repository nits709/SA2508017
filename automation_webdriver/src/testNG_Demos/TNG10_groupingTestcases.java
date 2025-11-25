package testNG_Demos;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.baseFunction;

public class TNG10_groupingTestcases extends baseFunction {

	@Test(priority = 1, groups = "Sell")
	public void sellLinkTest() {

		driver.findElement(By.linkText("Sell")).click();

	}

	@Test(priority = 2, groups = "Sell")
	public void mobilesLinkTest() {

		driver.findElement(By.linkText("Mobiles")).click();

	}

	@Test(priority = 3, groups = "Purchase")
	public void bestsellersLinkTest() {

		driver.findElement(By.linkText("Bestsellers")).click();

	}

	@Test(priority = 4, groups = "Purchase")
	public void electronicsLinkTest() {

		driver.findElement(By.linkText("Electronics")).click();

	}

	@BeforeMethod(alwaysRun = true)
	public void setUpURl() {

		launchURL("https://www.amazon.in/");
	}

	@BeforeTest(alwaysRun = true)
	public void setupBrowser() {
		launchBrowser(bName);
	}

	@AfterTest(alwaysRun = true)
	public void closeBrowser() {
		quitBrowser();

	}

}
