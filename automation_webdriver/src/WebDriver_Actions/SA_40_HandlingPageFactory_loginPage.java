package WebDriver_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.baseFunction;

public class SA_40_HandlingPageFactory_loginPage extends baseFunction {

	@FindBy(id = "email")
	WebElement usernameField;
	@FindBy(id = "pass")
	WebElement passwordField;
	@FindBy(name = "login")
	WebElement loginButton;

	public void setUp() {
		PageFactory.initElements(driver, this);
	}

	@BeforeMethod
	public void tearUp() {
		driver = new ChromeDriver();
		setUp();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
	}

	@Test
	public void testLogin() {
		usernameField.sendKeys("asdfdsasdf@gmail.com");
		passwordField.sendKeys("asdsasddssd");
		loginButton.click();
	}

	@AfterMethod
	public void tearDown() {
		quitBrowser();

	}

}
