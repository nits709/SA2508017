package api_testcases;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;
/*
 * given() - pre-requisite
 * header, path parameter, query parameter, request payload, authorization
 * 
 * When() : action
 * Get(), post(), put(),patch(), delete()
 * 
 *  Then(): Validate response
 *  status code, status response,response time, cookies, header, response payload
 * */

public class teleComProject {

	String userToken;

	@Test(priority = 1)
	public void AddNewUser() {

		Response res = given().header("Content-Type", "application/json")
				.body("{\n" + "\"firstName\": \"nitin_Automation\",\n" + "\"lastName\": \"api\",\n"
						+ "\"email\": \"telecomproject1" + System.currentTimeMillis() + "@yopmail.com\",\n"
						+ "\"password\": \"Smart@123\"\n" + "}")
				.when().post("https://thinking-tester-contact-list.herokuapp.com/users");

		res.then().log().body();
		userToken = res.jsonPath().getString("token");
		System.out.println("Token " + userToken);
		System.out.println("status code " + res.statusCode());

		System.out.println("**********************************************************");
	}

	@Test(priority = 2, dependsOnMethods = "AddNewUser")
	public void getProfile() {
		Response res = given().header("Content-Type", "application/json").header("Authorization", "Bearer " + userToken)
				.when().get("https://thinking-tester-contact-list.herokuapp.com/users/me");

		res.then().log().body();
		System.out.println("status code " + res.statusCode());
	}

	@Test(dependsOnMethods = "AddNewUser")
	public void deleteContact() {

		Response res = given().header("Content-Type", "application/json").header("Authorization", "Bearer " + userToken)
				.when().delete("https://thinking-tester-contact-list.herokuapp.com/contacts/6971054f200602001583cccd");

		res.then().log().body();

	}

}
