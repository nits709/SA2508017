package WebDriver_Actions;

import org.openqa.selenium.By;

import Utility.baseFunction;

public class SA_32_HandlingFileUploading extends baseFunction {

	
	//ROBOT class java class.
	public static void main(String[] args) {

		String filename = "/Volumes/Renuka/Professional Stuff (Restricted)/Session_material/Reference_SeleniumNoteMaterials/Picture 1.png";

		launchBrowser(bName);
		launchURL("https://demoqa.com/automation-practice-form");

		driver.findElement(By.id("uploadPicture")).sendKeys(filename);

	}

}
