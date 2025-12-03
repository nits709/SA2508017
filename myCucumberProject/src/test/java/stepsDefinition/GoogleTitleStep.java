package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleTitleStep {

	@Given("The user launch google URL")
	public void the_user_launch_google_url() {
		System.out.println("URL is calling");
	}

	@When("The user reads page title")
	public void the_user_reads_page_title() {
		System.out.println("user is reading the title");
	}

	@Then("The user validate page Title")
	public void the_user_validate_page_title() {
		System.out.println("user is validating page URL");
	}

}
