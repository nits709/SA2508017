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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLoginDataThenWriteIntoFile {
	File file;
	FileOutputStream fos; // write the data
	XSSFWorkbook wb; // workbook
	XSSFSheet sheet;
	XSSFRow rows;
	XSSFCell cell;
	int index = 0;

	@Test(dataProvider = "setData1")
	public void getData(String username, String password, String phoneNo) {

		// write data into 0,0
		rows = sheet.createRow(index);
		cell = rows.createCell(0);
		cell.setCellValue(username);

		// 0,1
		cell = rows.createCell(1);
		cell.setCellValue(password);

		// 0,2
		cell = rows.createCell(2);
		cell.setCellValue(phoneNo);

		index++;

	}

	@DataProvider
	public Object[][] setData1() {
		return new Object[][] { new Object[] { "username", "password", "phoneNo" },
				new Object[] { "Ketaki", "Tiwari", "XXXEEEEEEE" }, new Object[] { "ARUN", "Saxena", "1234567897654" },
				new Object[] { "John", "Doe", "98765432" }, new Object[] { "Deepak", "paratakar", "654312345" },
				new Object[] { "AArya", "Gupta", "323232323" }, };

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

//	@DataProvider
//	public Object[][] setData() {
//
//		Object[][] data = new Object[5][3];
//		
//		data[0][0] = "Username";
//		data[0][1] = "Password";
//		data[0][2] = "PhoneNo.";
//
//		data[1][0] = "John";
//		data[1][1] = "Cena";
//		data[1][2] = "987654323456";
//
//		data[2][0] = "Ketaki";
//		data[2][1] = "Tiwari";
//		data[2][2] = "33455678898";
//
//		data[3][0] = "Sachin";
//		data[3][1] = "Yadav";
//		data[3][2] = "3XXXXXX8";
//		
//
//		return data;
//
//	}
}
