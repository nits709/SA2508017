package Browser_Locators;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SA_01_LaunchBrowser {

	//command + shift + o
	 //cntrl + shift + o (import the library or package)
	public static void main(String[] args) throws MalformedURLException {
		
		//Launch chrome browser
		WebDriver driver = new ChromeDriver();
	
		//Safari browser
		//WebDriver driver1 = new SafariDriver();
		
		//Maximized the browser
		driver.manage().window().maximize();
		
		// launch Url
		driver.get("https://www.google.co.in");
		
		// closing the opened browser
		//driver.close();
	}
}
