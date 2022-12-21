package practice;




import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojo_class.UserLib;

import static io.restassured.RestAssured.*;

public class PracticeBddmethodPut {
	@Test
	public void updateUserTest()
	{
		
		UserLib pojo =new UserLib("morpheus","hero");
	given()
	.body(pojo)
	.contentType(ContentType.JSON)
	
	.when()
	.put("https://reqres.in/api/users/2")
	.then()
	.assertThat().statusCode(200)
	.log().all();
	
	
	}

}
