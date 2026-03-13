package keywordFunctions;

import org.apache.poi.xssf.usermodel.XSSFRow;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Utility.ExcelUtility;

public class BaseLogic extends ActionKeyword {

	
	ExtentReports extent;
	static ExtentTest test;
	public void loadLogic(String tcName) {

		 extent =ExtentManager.getReporterObject();
		 test = extent.createTest(tcName);
		ExcelUtility eu = new ExcelUtility();

		int tRows = eu.getNoOfrows(); // total no.of rows - 8
		System.out.println("number of rows " + tRows);

		for (int row = 1; row < tRows; row++) {
			System.out.println("----");
			XSSFRow r = eu.sheet.getRow(row);

			System.out.println("number of rows " + row);
			String currentTestName = r.getCell(0).getStringCellValue();

			if (!currentTestName.equalsIgnoreCase(tcName))
				continue;

			String keyword = r.getCell(1).getStringCellValue();
			String Object = r.getCell(2).getStringCellValue();
			String value = r.getCell(3).getStringCellValue();

			System.out.println(
					"Keyword " + keyword + " -- " + " Object " + " -- " + Object + " -- " + " value " + " -- " + value);

			try {
				if (keyword.equals("openBrowser")) {
					openBrowser(value);
				} else if (keyword.equals("navigate")) {
					navigate(value);
				} else if (keyword.equals("type")) {
					type(Object, value);
				} else if (keyword.equals("click")) {
					click(Object);
				} else if (keyword.equals("verifyText")) {
					verifyText(Object);
				} else if (keyword.equals("closeBrowser")) {
					closeBrowser();
				}
				
				test.pass("Step Passed : " + keyword);
			} catch (Exception e) {
				String screenshotPath = captureScreenshot(driver, keyword);
				test.fail("Step Failed : " + keyword);
	            test.fail(e.getMessage());
	            test.addScreenCaptureFromPath(screenshotPath);
	            break;
			}

		}
		
		extent.flush();

	}

}
