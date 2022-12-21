package practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo_class.UserLib;

public class PatchOperationPractice {
	@Test
	public void patchOperationTest()
	{
	
		UserLib pojo = new UserLib("morpheus","zion resident");
		
		
		RequestSpecification request= RestAssured.given();
		request.body(pojo);
		request.contentType(ContentType.JSON);
		
		Response resp =RestAssured.patch("https://reqres.in/");
		
		System.out.println(resp.asString());
	}

}
