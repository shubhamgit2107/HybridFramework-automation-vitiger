package reqres.CRUDoperation;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojo_class.UserLibrary;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
public class CreateUserWithBdd {

	@Test
	
	public  void createUser()
	{
	//	HashMap obj = new HashMap();
	//	obj.put("name", "morpheus");
	//	obj.put("job", "leader");
		 UserLibrary pojo =new  UserLibrary("shubham","automation");
		given()
		.body(pojo)
		.contentType(ContentType.JSON)
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}
}
