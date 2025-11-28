package testcases;

import org.testng.annotations.Test;

import keywordFunctions.BaseLogic;

public class logintestcases {

	
	BaseLogic bl = new BaseLogic();
	
	
	@Test
	public void testLoginWithValidData() {
		bl.loadLogic("Login");

	}
}
