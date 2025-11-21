package testNG_Demos;

import org.testng.SkipException;
import org.testng.annotations.Test;

import Utility.baseFunction;

public class TNG_03_TestNG_DependsOnMethods extends baseFunction {

	boolean flag = true;

	@Test(priority = 1)
	public void searchMobile() {
		if (flag) {
			throw new SkipException("Skipping testcases");
		}
		System.out.println("searching the phone......");
	}

	@Test(priority = 2, dependsOnMethods = { "searchMobile" })
	public void selectMobileAddToCart() {
		System.out.println("Adding mobile to cart.........");
	}

	@Test(priority = 3, dependsOnMethods = { "searchMobile", "selectMobileAddToCart" })
	public void checkoutMobile() {
		System.out.println("checkout.......");
	}
}
