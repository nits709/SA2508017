package extentReporting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class generateExtentreport {

	public static void main(String[] args) {

		// ExtentSparkReporter - use to generate .html report file
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("simpleReport.html");

		ExtentReports report = new ExtentReports();
		report.attachReporter(htmlReport);

		ExtentTest test1;
		// added some environment infor to report.
		report.setSystemInfo("ProjectName", "Automation Project");
		report.setSystemInfo("Machine", "Mac");
		report.setSystemInfo("Company", "Star Agile");
		report.setSystemInfo("User", "Automation user");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("Tool", "Selenium Webdriver");

		// configuration to report
		htmlReport.config().setDocumentTitle("My simple Extent Report");
		htmlReport.config().setReportName("Selenium Report");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTimeStampFormat("dd-MMMM-YYYY");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();

		System.out.println("get Title " + driver.getTitle());
		driver.close();

		test1 = report.createTest("Login Test");
		test1.log(Status.PASS, MarkupHelper.createLabel("Login: pass", ExtentColor.GREEN));

		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://practicetestautomation.com/practice-test-login/");
		driver1.findElement(By.id("username")).sendKeys("student");
		driver1.findElement(By.id("password")).sendKeys("Password123");
		driver1.findElement(By.id("submit")).click();

		System.out.println("get Title " + driver1.getTitle());
		driver1.close();
		
		test1 = report.createTest("Login fail");
		test1.log(Status.FAIL, MarkupHelper.createLabel("Login: fail", ExtentColor.RED));
		
		report.flush();
		
		
	}

}
