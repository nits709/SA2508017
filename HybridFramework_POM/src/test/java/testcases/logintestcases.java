package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class logintestcases extends BaseTest {

	@Test
	public void verifyLogin() {
		test = report.createTest("Login Test");
		LoginPage lp = new LoginPage(driver);
		lp.testLogin("Admin", "admin123");
		test.pass("Login Successfully");

	}

}
