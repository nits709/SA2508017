package stepdefinitions;

import org.openqa.selenium.WebDriver;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverFactory;

public class LoginSteps {

	WebDriver driver = DriverFactory.getDriver();


	HomePage home;
	LoginPage login;

	@Given("user is on homepage")
	public void open_home() {

		home = new HomePage(driver);
	}

	@When("user clicks signup login")
	public void click_signup() {

		home.clickSignupLogin();
	}

	@And("user enters email and password")
	public void login_user() {

		login = new LoginPage(driver);
		login.login("test@gmail.com", "12345");
	}

	@Then("user login should be successful")
	public void verify_login() {

	}

}