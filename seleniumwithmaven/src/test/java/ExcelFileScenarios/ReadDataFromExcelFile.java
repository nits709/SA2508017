package ExcelFileScenarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadDataFromExcelFile {

	String filePath = "/Volumes/Renuka/TrainingExcelFiles/Book2.xlsx";
	File file;
	FileInputStream fis; // write the data
	XSSFWorkbook wb; // workbook
	XSSFSheet sheet;
	XSSFRow rows;
	XSSFCell cell;

	@Test
	public void getDataFromExcelFile() {

		rows = sheet.getRow(0); // get row with index return existence of specified row index.
		cell = rows.getCell(0); // get cell with index existence of specified cell index.

		System.out.println("returns data at 0th row and 0th cell -->" + cell.getStringCellValue());
		System.out
				.println("returns data at 0th row and 1th cell --> " + sheet.getRow(0).getCell(1).getStringCellValue());

	}

	@Test
	public void getCompletedDataFromFile() {

		int totalRows = sheet.getPhysicalNumberOfRows(); // returns total number of rows and index starts with 0
		int totalCell = sheet.getRow(0).getPhysicalNumberOfCells(); // return total number of column ans index starts
																	// with 0
		for (int i = 0; i < totalRows; i++) {
			rows = sheet.getRow(i); // 0

			for (int j = 0; j < totalCell; j++) {
				cell = rows.getCell(j); // 0

				System.out.print(cell.getStringCellValue() + " | ");
			}
			System.out.println();
		}

	}

	@BeforeTest
	public void setupObjects() throws IOException {

		file = new File(filePath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("LoginData");

	}

	@AfterTest
	public void closeObject() throws IOException {
		wb.close();
		fis.close();
	}

}
