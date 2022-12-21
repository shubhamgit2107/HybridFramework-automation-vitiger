package responsevalidation;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import pojo_class.UserLibrary;

public class ResponseValidation {
	
	

	@Test
	public void respValidation()
	{
	UserLibrary pojo = new	UserLibrary("morpheus", "leader");
	 baseURI = "https://reqres.in";
	 given()
	 .body(pojo)
	 .contentType(ContentType.JSON)
	 .when()
	 .post("/api/users")
	 .then()
	 .assertThat().contentType(ContentType.JSON)
	 .log().all();
	 
	}

}
