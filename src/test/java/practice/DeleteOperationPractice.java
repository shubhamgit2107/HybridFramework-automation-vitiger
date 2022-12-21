package practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteOperationPractice {
	@Test
	public void deleteOperationTest()
	{
		RequestSpecification request= RestAssured.given();
		
		Response resp= RestAssured.delete("https://reqres.in/");
		System.out.println(resp.asString());
		
		
	
	}

}
