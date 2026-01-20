package com.blazedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class reservePage {

	WebDriver driver;
	
	/// html/body/div[2]/table/tbody/tr[5]/td[3]
		// td[text()='United Airlines']
	
	
	//final static By selectFlights = By.xpath("//html/body/div[2]/table/tbody/tr[5]/td[3]");
	final static String selectFlights = "//td[text()='%s']";

	public reservePage(WebDriver driver) {
		this.driver = driver;
	}

	

	public void selectFlight(String flightName) {
		System.out.println(String.format(selectFlights,flightName));
		driver.findElement(By.xpath(String.format(selectFlights,flightName))).click();
	}
}
