package testNG_Demos;

import org.testng.annotations.Test;

import Utility.baseFunction;

public class TNG_02_Priority extends baseFunction {

	@Test(priority = 1)
	public void setupBrowser() {
		System.out.println("Launch Browser");
	}

	@Test(priority = 5)
	public void setupAppURL() {

		System.out.println("launch URL");
	}

	@Test(priority = 3)
	public void doRegisteration() {
		System.out.println("legisteration done");
	}

	@Test(priority = 4)
	public void doLogin() {
		System.out.println("login done");
	}

	@Test(priority = 2)
	public void closeBrowser() {
		System.out.println("closeBrowser");
	}

}
