package com.blazedemo.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseTest {

	protected WebDriver driver;

	@BeforeMethod  // responsible to launch browser + URL
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
