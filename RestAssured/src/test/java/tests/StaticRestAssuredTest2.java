package tests;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;


import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class StaticRestAssuredTest2 {
	
	@Test
	public void staticTest1() {
		
		baseURI="https://reqres.in/api";
		given().get("/users?page=2").then().statusCode(200) ;		
		

	}

	
}
