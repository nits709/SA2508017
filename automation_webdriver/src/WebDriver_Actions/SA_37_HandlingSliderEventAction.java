package WebDriver_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.baseFunction;

public class SA_37_HandlingSliderEventAction extends baseFunction {

	public static void main(String[] args) throws InterruptedException {

		launchBrowser(bName);
		launchURL("https://jqueryui.com/slider/");
		Actions act = new Actions(driver);

		driver.switchTo().frame(0);

		WebElement sliderButton = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));

		System.out.println("location of x axis " + sliderButton.getLocation().x);
		System.out.println("location of y axis " + sliderButton.getLocation().y);

		int points = sliderButton.getLocation().x + 500;

		//move towards from left to right upto 500 points
		act.dragAndDropBy(sliderButton, points, sliderButton.getLocation().y).build().perform();

		
		// this move from right to left 500 to -300
		act.dragAndDropBy(sliderButton, -300, sliderButton.getLocation().y).build().perform();

		System.out.println("location of x axis " + sliderButton.getLocation().x);

		Thread.sleep(2000);

		quitBrowser();

	}
}
