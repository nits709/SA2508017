package WebDriver_Actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import Utility.baseFunction;

public class SA_33_HandlingMultipleWindows extends baseFunction {

	public static void main(String[] args) throws InterruptedException {

		launchBrowser(bName);
		launchURL("https://www.naukri.com/");

		System.out.println("Get the title of Home Page " + driver.getTitle());

		// Clicks on MNC element
		driver.findElement(By.xpath("//*[@id='trending-naukri-wdgt']/div/div[1]/a[2]")).click();

		Set<String> windows = driver.getWindowHandles(); // method would return Id's of all opened windows
		Iterator<String> it = windows.iterator();

		String mainWindow = it.next(); // main window
		String childWindow = it.next(); // childWindow

		System.out.println("MainWindow " + mainWindow + "  :   " + "ChildWindow " + childWindow);

		driver.switchTo().window(childWindow);

		Thread.sleep(4000);

		System.out.println("Get the title of MNC Page " + driver.getTitle());

		// clicks on Login Button
		driver.findElement(By.xpath("//*[@id='login_Layer']")).click();

		System.out.println("text from login slider " + driver
				.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div[2]/div/div[2]/div/div[1]/a")).getText());

		// driver.close();
		driver.quit(); // quit will closed all opened window during single session.

	}

}
