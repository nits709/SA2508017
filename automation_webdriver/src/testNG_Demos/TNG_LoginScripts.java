package testNG_Demos;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
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

	@Test(priority = 1)
	public void loginApplicationWithValidData() throws IOException {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		System.out.println("loginSuccessfully "
				+ driver.findElement(By.xpath("//*[@id='loop-container']/div/article/div[2]/p[1]/strong")).getText());

		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();

	}

	@Test(priority = 2)
	public void loginApplicationWithInValidData() {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		System.out.println("loginSuccessfully "
				+ driver.findElement(By.xpath("//*[@id='loop-container']/div/article/div[2]/p[1]/strong")).getText());

		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
	}

	@Test(priority = 3)
	public void loginApplicationWithIValidUsernameData() {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password1234");
		driver.findElement(By.id("submit")).click();
		System.out.println("loginSuccessfully "
				+ driver.findElement(By.xpath("//*[@id='loop-container']/div/article/div[2]/p[1]/strong")).getText());

		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
	}

}
