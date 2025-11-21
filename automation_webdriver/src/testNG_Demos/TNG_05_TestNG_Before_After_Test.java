package testNG_Demos;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.baseFunction;

public class TNG_05_TestNG_Before_After_Test extends baseFunction {

	@BeforeTest
	public void setUpBrowser() {
		launchBrowser(bName);
		System.out.println("BeforeTest");
	}

	@AfterTest
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
