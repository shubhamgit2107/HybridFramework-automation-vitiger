package practice;


import java.io.File;

import org.json.simple.JSONObject;
import org.junit.runner.Request;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JsonObjectPractice {
	@Test
	public void jsonPracticeTest()
	{
		JSONObject obj= new JSONObject();
		obj.put("id","2");
		obj.put("name","Janet");
		
		RequestSpecification request=RestAssured.given();
		request.body(obj);
		request.contentType(ContentType.JSON);
		
		Response resp= request.get("https://reqres.in/");
		
		System.out.println(resp.asString());
		
	}

	
	

}
