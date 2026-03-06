package hooks;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;
import utilities.DriverFactory;


public class Hooks {

	WebDriver driver;

	@Before
	public void setup() {
		driver = DriverFactory.initDriver();
		driver.get(ConfigReader.getProperties().getProperty("baseUrl"));
	}

	@After
	public void tearDown() {

		driver.quit();
	}

	


	

}