package practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JsonObjectPost {
	@Test
	public void postOperationTest()
	{
		JSONObject obj=new JSONObject();
		obj.put("name", "morpheus");
		obj.put("job", "leade");
		
		RequestSpecification request=RestAssured.given();
		request.body(obj);
		request.contentType(ContentType.JSON);
		Response resp=request.post("https://reqres.in/");
		
		System.out.println(resp.asString());
		
	}

}
