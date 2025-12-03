package stepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver;

	@Given("The user launches the application URL")
	public void the_user_launches_the_application_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.co.in");
	}

	@When("The user enter testdata in search box")
	public void the_user_enter_testdata_in_search_box() {
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("selenium Webdriver");
	}

	@When("The user hit enter from keyboard")
	public void the_user_hit_enter_from_keyboard() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("The user validate the search result")
	public void the_user_validate_the_search_result() {
		driver.getTitle().contains("selenium");
	}

}
