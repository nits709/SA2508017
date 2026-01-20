package com.blazedemo.tests;

import org.testng.annotations.Test;

import com.blazedemo.pages.homePage;
import com.blazedemo.pages.reservePage;
import com.blazedemo.utils.baseTest;

public class flightAppTestcases extends baseTest {

	homePage hp;
	reservePage rp;

	@Test (groups="smoke")
	public void TC_01_VerfiyHomePage() {
		hp = new homePage(driver);
		hp.homePageDisplayed();

	}

	@Test(groups="functional")
	public void TC_02_searchFlights() {
		hp = new homePage(driver);
		hp.searchFlights("Boston", "New York");
	}
	
	@Test(groups="functional")
	public void TC_03_SelectFlight() {
		TC_02_searchFlights();
		rp= new reservePage(driver);
		rp.selectFlight("United Airlines");
	}

}
