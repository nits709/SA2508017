package com.blazedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class homePage {

	final static By departureCity = By.name("fromPort");
	final static By destinationCity = By.name("toPort");
	final static By findFlights = By.cssSelector("input[value='Find Flights']");

	// this page holds function and locators for homepage only
	public WebDriver driver;

	public homePage(WebDriver driver) {
		this.driver = driver;
	}

	public void homePageDisplayed() {
		Assert.assertTrue(driver.findElement(departureCity).isDisplayed(), "Homepage is not displayed , please verify");
	}

	public void searchFlights(String from, String to) {
		new Select(driver.findElement(departureCity)).selectByVisibleText(from);
		new Select(driver.findElement(destinationCity)).selectByVisibleText(to);
		driver.findElement(findFlights).click();
	}

}
