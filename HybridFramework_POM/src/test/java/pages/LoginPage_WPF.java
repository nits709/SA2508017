package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage_WPF {
	WebDriver driver;

	final static By usernameField = By.name("username");
	final static By passwordField = By.name("username");
	final static By loginButton = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

	// action/method of loginpage
	public void testLogin(String username, String password) {
		try {
			Thread.sleep(2000);
			driver.findElement(usernameField).sendKeys(username);
			driver.findElement(passwordField).sendKeys(password);
			driver.findElement(loginButton).click();
		} catch (Exception e) {

		}
	}
}
