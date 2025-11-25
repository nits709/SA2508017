package testNG_Demos;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TNG_09_Assertions {

	@Test
	public void testA() {

//		System.out.println("TestA");
//
//		Assert.assertTrue(2 >= 2); // true
//		
//		//assertFalse(2>=2); //false
//		assertFalse(2>=4); //false
//		System.out.println("TestB");
//
//		// Assert.assertTrue(2 >= 4); // false
//
//		assertEquals("Nitin", "Nitin"); // pass
//		assertNotEquals("Nitin", "Sachin"); //pass
//		System.out.println("TestC");
//		assertEquals("Sachin", "Nitin"); // False
//		System.out.println("TestD");
//		System.out.println("TestE");

		SoftAssert sa = new SoftAssert();

		System.out.println("Test A");
		sa.assertTrue(2 >= 2); // true
		System.out.println("Test B");
		System.out.println("Test C");
		sa.assertTrue(2 >= 4); // false
		System.out.println("Test D");
		sa.assertEquals("Selenium", "WebDriver"); // false
		System.out.println("Test E");
		System.out.println("Test F");

		sa.assertAll();

	}

}
