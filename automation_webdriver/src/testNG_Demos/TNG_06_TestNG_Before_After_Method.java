package testNG_Demos;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.baseFunction;

public class TNG_06_TestNG_Before_After_Method extends baseFunction {

	@BeforeMethod
	public void setUpBrowser() {
		launchBrowser(bName);
		System.out.println("BeforeTest");
	}

	@AfterMethod
	public void closeBrowser() {
		quitBrowser();
		System.out.println("AfterTest");
	}

	@Test(priority = 3)
	public void facebookTest() {
		launchURL("https://www.facebook.com/");
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
