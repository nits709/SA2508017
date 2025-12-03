package seleniumwithmaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class readWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/91778/aus-vs-ind-1st-test-india-tour-of-australia-2024-25");

		driver.manage().window().maximize();

		List<WebElement> Rows = driver
				.findElements(By.xpath("(//*[@id='scard-team-2-innings-1'])[2]/div[1]/div[1]/div"));

		System.out.println("Headers - " + Rows.size());

	}
}
