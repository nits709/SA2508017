package WebDriver_Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utility.baseFunction;

public class CrickBuzz_Web_Table extends baseFunction {

	public static void main(String[] args) {
		launchBrowser(bName);

		launchURL("https://echoecho.com/htmlforms10.htm");

		List<WebElement> radiosGroup1 = driver.findElements(By.name("radio1"));

		// Get radios from second group

		List<WebElement> radiosGroup2 = driver.findElements(By.name("radio2"));

		System.out.println("=== Initial Status of Radio Buttons === "+radiosGroup2.size());

		for (WebElement radio : radiosGroup1) {

			System.out.println(radio.getAttribute("value") + " -> Selected? " + radio.isSelected());

		}

		for (WebElement radio : radiosGroup2) {

			System.out.println(radio.getAttribute("value") + " -> Selected? " + radio.isSelected());

		}

		// Click each radio button

		for (WebElement radio : radiosGroup1) {

			radio.click();

		}

		for (WebElement radio : radiosGroup2) {

			radio.click();

		}

		System.out.println("\n=== Status After Clicking Each Radio Button ===");

		for (WebElement radio : radiosGroup1) {

			System.out.println(radio.getAttribute("value") + " -> Selected? " + radio.isSelected());

		}

		for (WebElement radio : radiosGroup2) {

			System.out.println(radio.getAttribute("value") + " -> Selected? " + radio.isSelected());

		}

		// Close browser

		driver.quit();

	}

}
