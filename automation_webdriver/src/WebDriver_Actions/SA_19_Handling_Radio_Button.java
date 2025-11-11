package WebDriver_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.baseFunction;

public class SA_19_Handling_Radio_Button extends baseFunction {

	public static void main(String[] args) {
		launchBrowser(bName);
		launchURL("https://register.rediff.com/register/register.php?FormName=user_details");

		WebElement radioButton = driver.findElement(By.xpath("//input[@value='f']"));

		System.out.println("present on page -> " + radioButton.isDisplayed());
		System.out.println("element is selected on page -> " + radioButton.isSelected());
		System.out.println("element is enable on page -> " + radioButton.isEnabled());

		radioButton.click();

		System.out.println("present on page -> " + radioButton.isDisplayed());
		System.out.println("element is selected on page -> " + radioButton.isSelected());
		System.out.println("element is enable on page -> " + radioButton.isEnabled());
	}

}
