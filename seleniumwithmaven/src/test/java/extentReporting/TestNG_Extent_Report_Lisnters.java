package extentReporting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestNG_Extent_Report_Lisnters {

	WebDriver driver;
	ExtentSparkReporter htmlReport;
	ExtentReports report;
	ExtentTest test1;;

	@Test(priority = 1)
	public void loginApplicationWithValidData() throws IOException {
		test1 = report.createTest("Login Pass");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		System.out.println("loginSuccessfully "
				+ driver.findElement(By.xpath("//*[@id='loop-container']/div/article/div[2]/p[1]/strong")).getText());

		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();

	}

	@Test(priority = 2)
	public void loginApplicationWithInValidData() throws IOException {
		test1 = report.createTest("Login Fail");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password");
		driver.findElement(By.id("submit")).click();
		System.out.println("loginSuccessfully "
				+ driver.findElement(By.xpath("//*[@id='loop-container']/div/article/div[2]/p[1]/strong")).getText());

		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();

	}

	@Test(priority = 3)
	public void loginApplicatinoSkipTest() {
		test1 = report.createTest("Skip Test");
		throw new SkipException("skipping my testcases to generate report");

	}

	@BeforeTest
	public void beforeTest() {
		// ExtentSparkReporter - use to generate .html report file
		htmlReport = new ExtentSparkReporter("TestNGReportListner.html");

		report = new ExtentReports();
		report.attachReporter(htmlReport);

//		ExtentTest test1;
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
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@AfterMethod
	public void afterMethod(ITestResult result)
	// ITestResult will give you detailed information about the @Test
	{
		if (result.getStatus() == ITestResult.SUCCESS) {
			test1.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
		} else if (result.getStatus() == ITestResult.FAILURE) {
			test1.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
			test1.fail(result.getThrowable()); // getThrowable() will get the failure log
		} else if (result.getStatus() == ITestResult.SKIP) {
			test1.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.ORANGE));
			test1.skip(result.getThrowable());
		}
	}

	@AfterTest
	public void afterTest() {

		report.flush();
		driver.quit();

	}
}
