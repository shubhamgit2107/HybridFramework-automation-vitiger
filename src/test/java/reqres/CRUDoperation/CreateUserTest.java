package reqres.CRUDoperation;

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo_class.UserLibrary;

public class CreateUserTest {
	@Test
	
	public void createUser()
	{
	JSONObject obj=new JSONObject();
		obj.put("name", "morpheus");
	obj.put("job", "leader");
	 

		
		RequestSpecification request = RestAssured.given();
		request.body(obj);
		request.contentType(ContentType.JSON);
		
		Response resp =request.post("https://reqres.in/");
		
		System.out.println(resp.asString());
		
	}

}
