package stepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.baseFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleLinksStep {

	WebDriver driver;

	@Given("I open Google URL {string}")
	public void i_open_google_url(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}

	@When("I click on Gmail Link")
	public void i_click_on_gmail_link() {
		driver.findElement(By.linkText("Gmail")).click();
	}

	@Then("Gmail Page Should opened")
	public void gmail_page_should_opened() {
		driver.getTitle().contains("Gmail");
	}

	@When("I close the Browser")
	public void i_close_the_browser() {
		driver.quit();
	}

	@When("I click on Image Link")
	public void i_click_on_image_link() {
		driver.findElement(By.linkText("Images")).click();
	}

	@Then("Image page should opened")
	public void image_page_should_opened() {
		driver.getTitle().contains("Images");
	}

	@When("I click on Adv Link")
	public void i_click_on_adv_link() {
		driver.findElement(By.linkText("Advertising")).click();
	}

	@Then("Adv page should opened")
	public void adv_page_should_opened() {
		driver.getTitle().contains("Advertising");
	}

	@When("I click on Business Link")
	public void i_click_on_business_link() {
		driver.findElement(By.linkText("Business")).click();
	}

	@Then("Business Page should opened")
	public void business_page_should_opened() {
		driver.getTitle().contains("Business");
	}
	
	@When("The user add product to cart")
	public void the_user_add_product_to_cart() {
	  driver.findElement(By.id("addtoCart")).click();
	}

	@When("The user enter credit cart details")
	public void the_user_enter_credit_cart_details() {
	   	
	}

}
