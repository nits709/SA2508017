package testNG_Demos;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Utility.baseFunction;

public class TNG_07_Before_Test_Methof extends baseFunction {

	@BeforeTest
	public void setUpBrowser() {
		launchBrowser(bName);
		System.out.println("BeforeTest");
	}

	@BeforeMethod
	public void openAppilcationURL() {
		launchURL("https://www.facebook.com/");
	}

	@AfterMethod
	public void closeBrowser() {
		quitBrowser();
		System.out.println("AfterTest");
	}

	@Test(priority = 3)
	public void facebookTest() {

		System.out.println("Title " + driver.getTitle());
	}

	@Test(priority = 2)
	public void myntraTest() {
		launchURL("https://www.myntra.com/");
		System.out.println("Title " + driver.getTitle());
	}

	@Test(priority = 1)
	public void googleTest() {
		launchURL("https://www.google.com/");
		System.out.println("Title " + driver.getTitle());
	}

}
