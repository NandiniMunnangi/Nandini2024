package tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class RestGetAndPostExample {
	
//	@Test
	public void getTest() {
		
		baseURI= "https://reqres.in/api";
		given().get("/users?page=2").then().statusCode(200).body("data[4].first_name", equalTo("George")).body("data.first_name", hasItems("George","Rachel")); 
	}
	
@Test
	public void postTest() {
		JSONObject request=new JSONObject();
		request.put("name", "Raghav");
		request.put("job", "Teacher");
		System.out.println(request.toJSONString());
		
		baseURI= "https://reqres.in/api";
		
		given().
		 body(request.toJSONString()).
		when().
		  post("/users").
		then().
		 statusCode(201).
		 log().all();
		 
	}
	

}
