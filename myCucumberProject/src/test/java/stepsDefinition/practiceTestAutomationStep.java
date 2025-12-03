package stepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class practiceTestAutomationStep {

	WebDriver driver;

	@Given("The user launch the application url {string}")
	public void the_user_launch_the_application_url(String appURL) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appURL);
	}

	@When("The user enter username {string}")
	public void the_user_enter_username(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@When("The user enter password {string}")
	public void the_user_enter_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("The user submit login")
	public void the_user_submit_login() {
		driver.findElement(By.id("submit")).click();
	}

	@Then("The user validate login successfully")
	public void the_user_validate_login_successfully() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
	}

}
