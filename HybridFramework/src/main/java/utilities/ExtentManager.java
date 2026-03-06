package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	static ExtentReports report;
	
	
	public static ExtentReports getReporterObject() {
		
	
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("simpleReport.html");
		report = new ExtentReports();
		report.attachReporter(htmlReport);
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
		
		return report;
		
	}
}
