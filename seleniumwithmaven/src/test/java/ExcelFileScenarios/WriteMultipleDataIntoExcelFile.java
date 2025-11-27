package ExcelFileScenarios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WriteMultipleDataIntoExcelFile {

	File file;
	FileOutputStream fos; // write the data
	XSSFWorkbook wb; // workbook
	XSSFSheet sheet;
	XSSFRow rows;
	XSSFCell cell;

	@Test
	public void writeMultipleDataIntoFile() {
		rows = sheet.createRow(0); // create a row inside sheet at zero index.
		cell = rows.createCell(0); // create a cell inside row at zero index.
		cell.setCellValue("WebDriver");

		// rows = sheet.createRow(0);
		cell = rows.createCell(1);
		cell.setCellValue("TestNG");

		cell = rows.createCell(2);
		cell.setCellValue("Flag");

		/*----------------second row data--------------------*/

		rows = sheet.createRow(1); // create a row inside sheet at zero index.
		cell = rows.createCell(0); // create a cell inside row at zero index.
		cell.setCellValue("Playwrite");

		// rows = sheet.createRow(0);
		cell = rows.createCell(1);
		cell.setCellValue("Chai");

		cell = rows.createCell(2);
		cell.setCellValue("Flag");

		/*----------------Third row data--------------------*/

		rows = sheet.createRow(2); // create a row inside sheet at zero index.
		cell = rows.createCell(0); // create a cell inside row at zero index.
		cell.setCellValue("Cypress");

		// rows = sheet.createRow(0);
		cell = rows.createCell(1);
		cell.setCellValue("Chai");

		cell = rows.createCell(2);
		cell.setCellValue("Flag");
		
	}

	@BeforeTest
	public void setupObjects() throws FileNotFoundException {

		file = new File("MyMultipleDataExcelFile.xlsx");
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		// wb.createSheet(); // create sheet inside workbook based on index
		sheet = wb.createSheet("myFirstSheet"); // based on filename

	}

	@AfterTest
	public void closeObjects() throws IOException {

		wb.write(fos); // this function is very import to call inorder to write physical data into
						// excel file.
		wb.close();
		fos.close();

	}

}
