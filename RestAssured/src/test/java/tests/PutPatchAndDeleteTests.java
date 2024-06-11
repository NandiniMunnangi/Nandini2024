package tests;

import static io.restassured.RestAssured.*;
import  static org.hamcrest.Matcher.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutPatchAndDeleteTests {
	
	@Test
	public void testPut() {
		JSONObject request=new JSONObject();
		request.put("name", "Nandini");
		request.put("job","teacher");
		
		baseURI ="https://reqres.in/api";
		
		given().
		body(request.toJSONString()).
		when().
		put("/userss/2").
		then().
		statusCode(200);
		
	}
	
	@Test
	public void testPatch() {
		JSONObject request=new JSONObject();
		request.put("name", "Nandini");
		request.put("job","teacher");
		
		baseURI ="https://reqres.in/api";
		
		given().
		body(request.toJSONString()).
		when().
		patch("/userss/2").
		then().
		statusCode(200).log().all();
		
	}
	
	@Test
	public void testDelete() {
		
		baseURI ="https://reqres.in/api";
		when().
		delete("/userss/2").
		then().
		statusCode(204).log().all();
		
	}

}
