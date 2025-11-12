package WebDriver_Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utility.baseFunction;

public class SA_20_Handling_Dropdown extends baseFunction {

	public static void main(String[] args) throws InterruptedException {

		launchBrowser(bName);
		launchURL("https://register.rediff.com/register/register.php?FormName=user_details");

		WebElement countryDD = driver.findElement(By.id("country"));
		Select sc = new Select(countryDD);

		// all operation of element would perfrom by using select class object sc.

		System.out.println("first selected option " + sc.getFirstSelectedOption().getText());

//		System.out.println("fetching the options based on index ==> " + sc.getOptions().get(0).getText());
//		System.out.println("fetching the options based on index ==> " + sc.getOptions().get(20).getText());
//		System.out.println("fetching the options based on index ==> " + sc.getOptions().get(11).getText());

		List<WebElement> allOptions = sc.getOptions();

		System.out.println("total no. of options -->" + allOptions.size());

		for (WebElement ddOption : allOptions) {

			System.out.println("get text from option " + ddOption.getText());

		}

		// selecting the option from DD using visible text.
		sc.selectByVisibleText("Canada");
		System.out.println("first option ->" + sc.getFirstSelectedOption().getText());

		// selecting the option from DD using value attribute
		sc.selectByValue("29"); // Brazil

		Thread.sleep(2000);

		// select the option from DD using index(0th based)
		sc.selectByIndex(0); // india
		System.out.println("first option ->" + sc.getFirstSelectedOption().getText());
		quitBrowser();

	}
}
