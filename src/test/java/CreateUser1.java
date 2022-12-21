import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static io .restassured.RestAssured.*;
public class CreateUser1 {
	@Test
	public void CreateUser()
	{
	File obj = new File(".\\src\\test\\resources\\Data.json");
 given()
		.body(obj)
		.contentType(ContentType.JSON)
    
		
		.when()
		.post("https://reqres.in/api/user")
		.then()
		.assertThat.statuscode(201)
		.log().all();
		
		
		
		
		
		
		
		
		
	}

	private Object given() {
		// TODO Auto-generated method stub
		return null;
	}

}
