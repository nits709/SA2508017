package Browser_Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_15_ReadElementsByTagName {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://google.co.in");

		List<WebElement> noOfLinks = driver.findElements(By.tagName("a"));

		System.out.println("No of links--> " + noOfLinks.size());

		// get() function is in the list which return the index from the list.

//		System.out.println(noOfLinks.get(0).getText());
//		System.out.println(noOfLinks.get(1).getText());
//		System.out.println(noOfLinks.get(2).getText());

		for (int i = 0; i < noOfLinks.size(); i++) {
			System.out.println("print text of link ->" + noOfLinks.get(i).getText());
		}

		Thread.sleep(3000);

		driver.close();

	}
}
