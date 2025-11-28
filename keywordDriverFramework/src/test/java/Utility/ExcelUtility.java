package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	String filePath = "/Volumes/Renuka/Professional Stuff (Restricted)/Session_material/Session_WorkSpaces/SA2508017_Workspace/WebDriver_Module/keywordDriverFramework/src/test/java/testData/LoginTestData.xlsx";
	File file;
	FileInputStream fis; // write the data
	XSSFWorkbook wb; // workbook
	public XSSFSheet sheet;
	public XSSFRow rows;
	public XSSFCell cell;

	public ExcelUtility() {
		setupObjects();
		getDataFromExcelFile();
		closeObject();
	}

	public void setupObjects() {
		try {
			file = new File(filePath);
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet("LoginData");
		} catch (Exception e) {

			e.getMessage();
		}
	}

	public int getNoOfrows() {
		return sheet.getPhysicalNumberOfRows();
	}

	public void getDataFromExcelFile() {

		rows = sheet.getRow(0); // get row with index return existence of specified row index.
		cell = rows.getCell(0); // get cell with index existence of specified cell index.

		System.out.println("returns data at 0th row and 0th cell -->" + cell.getStringCellValue());
		System.out
				.println("returns data at 0th row and 1th cell --> " + sheet.getRow(0).getCell(1).getStringCellValue());

	}

	public void closeObject() {
		try {
			wb.close();
			fis.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
