package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features/GoogleLinks.feature" }, glue = {
		"stepsDefinition" }, tags = "@ALLLinks")
public class GoogleLinkRunner {

	/* single scenario - @Gmail
	 * 
	 * Multiple Scenario - @Gmail or @Images
	 * 
	 * Skip Scenario = not @Gmail
	 * 
	 * */
}
