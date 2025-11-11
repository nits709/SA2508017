package WebDriver_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.baseFunction;

public class SA_17_HandlingCheckbox extends baseFunction {

	public static void main(String[] args) throws InterruptedException {

		launchBrowser(bName);
		launchURL("https://register.rediff.com/register/register.php?FormName=user_details");

		// driver.findElement(By.cssSelector("input[name^='chk']")).click();

		WebElement checkbox = driver.findElement(By.xpath("//input[starts-with(@name,'chk')]"));

		System.out.println("=============== Before click================ ");
		System.out.println("check the presence of element over page " + checkbox.isDisplayed()); // true or false
		System.out.println("check the state of checkbox ->" + checkbox.isSelected());

		System.out.println("check the element enability -> " + checkbox.isEnabled());

		checkbox.click(); // true

		if (!checkbox.isSelected()) {
			checkbox.click();
		}

		System.out.println("=============== After click================ ");
		System.out.println("check the presence of element over page " + checkbox.isDisplayed());
		System.out.println("check the state of checkbox ->" + checkbox.isSelected());
		System.out.println("check the element enability -> " + checkbox.isEnabled());// true or false

		Thread.sleep(2000);

		quitBrowser();
	}

}
