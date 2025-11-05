package webdriver_demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_03_ReadPageTitle {

	public static void main(String[] args) {

		String expTitle = "Google", pageTitle;

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://google.co.in");

		pageTitle = driver.getTitle();
		String currentURL = driver.getCurrentUrl();

		System.out.println("Title of page " + pageTitle);

		System.out.println("CurrentURL of Page --> " + currentURL);

		if (expTitle.equals(pageTitle)) {
			System.out.println("My testcase passed");
		} else {
			System.out.println("My testcase failed");
		}

		driver.close();

	}

}
