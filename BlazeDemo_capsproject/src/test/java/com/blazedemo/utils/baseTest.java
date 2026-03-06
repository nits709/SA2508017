package com.blazedemo.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseTest {

	protected WebDriver driver;

	@BeforeTest  // responsible to launch browser + URL
	public void setUp() {
		System.out.println("BeforeMethod");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com");
	}

	@AfterTest
	public void tearDown() {
		System.out.println("AfterMethod");
		driver.quit();
	}

}
