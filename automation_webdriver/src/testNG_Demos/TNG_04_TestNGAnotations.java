package testNG_Demos;

import org.testng.annotations.Test;

import Utility.baseFunction;

public class TNG_04_TestNGAnotations extends baseFunction {

	@Test
	public void facebookTest() {
		launchBrowser(bName);
		launchURL("https://www.facebook.com/");
		System.out.println("Title " + driver.getTitle());
		quitBrowser();
	}

	@Test
	public void myntraTest() {
		launchBrowser(bName);
		launchURL("https://www.myntra.com/");
		System.out.println("Title " + driver.getTitle());
		quitBrowser();
	}

	@Test
	public void googleTest() {
		launchBrowser(bName);
		launchURL("https://www.google.com/");
		System.out.println("Title " + driver.getTitle());
		quitBrowser();
	}
}
