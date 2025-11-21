package testNG_Demos;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TNG_08_DataProvider {

	@Test(dataProvider = "supplyData")
	public void getData(String username, String password, String phoneNo) {
		System.out.println("Username -" + username + " password -" + password +  " phoneNo. -" + phoneNo);
	}

	@DataProvider
	public Object[][] supplyData() {

		Object[][] data = new Object[4][3];

		// data row 1

		data[0][0] = "Username";
		data[0][1] = "Password";
		data[0][2] = "PhoneNo.";

		data[1][0] = "John";
		data[1][1] = "Cena";
		data[1][2] = "987654323456";

		data[2][0] = "Ketaki";
		data[2][1] = "Tiwari";
		data[2][2] = "33455678898";

		data[3][0] = "Sachin";
		data[3][1] = "Yadav";
		data[3][2] = "3XXXXXX8";

		return data;
	}

}
