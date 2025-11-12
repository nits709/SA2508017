package WebDriver_Actions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.baseFunction;

//xpath index always starts from 1
public class SA_22_HandlingWebTable extends baseFunction {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser(bName);
		launchURL("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

		// fetching total no. of header column present in first row

		List<WebElement> noOfHeaders = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));

		System.out.println("total no of headers " + noOfHeaders.size());

		System.out.println("headerName " + noOfHeaders.get(0).getText());
		System.out.println("headerName " + noOfHeaders.get(1).getText());

		// name of headers
		for (WebElement headers : noOfHeaders) {
			System.out.println("Headers Name -> " + headers.getText());
		}

		// total no of rows;
		List<WebElement> nRows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));

		System.out.println("Total no of rows " + nRows.size());

		System.out.println("company name --> "
				+ driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[1]/a")).getText());

		for (int i = 0; i < nRows.size(); i++) {
			System.out.println(driver
					.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + (i + 1) + "]/td[1]/a")).getText());
		}

		Thread.sleep(2000);
		driver.close();

	}

}
