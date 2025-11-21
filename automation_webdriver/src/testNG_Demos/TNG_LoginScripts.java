package testNG_Demos;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.baseFunction;

public class TNG_LoginScripts extends baseFunction {

	@BeforeTest
	public void setUpBrowser() {
		launchBrowser(bName);
		launchURL("https://practicetestautomation.com/practice-test-login/");
	}

	@AfterTest
	public void closebrowser() {
		quitBrowser();
	}

	@Test
	public void loginApplicationWithValidData() {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		System.out.println("loginSuccessfully "
				+ driver.findElement(By.xpath("//*[@id='loop-container']/div/article/div[2]/p[1]/strong")).getText());

		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
	}

	@Test
	public void loginApplicationWithInValidData() {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		System.out.println("loginSuccessfully "
				+ driver.findElement(By.xpath("//*[@id='loop-container']/div/article/div[2]/p[1]/strong")).getText());

		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
	}

	@Test
	public void loginApplicationWithIValidUsernameData() {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password1234");
		driver.findElement(By.id("submit")).click();
		System.out.println("loginSuccessfully "
				+ driver.findElement(By.xpath("//*[@id='loop-container']/div/article/div[2]/p[1]/strong")).getText());

		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
	}

}
