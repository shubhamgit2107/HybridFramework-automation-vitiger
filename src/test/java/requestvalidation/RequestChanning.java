package requestvalidation;

import org.testng.annotations.Test;
import static io. restassured.RestAssured.*;
import io.restassured.response.Response;



public class RequestChanning {
	


	@Test
	
	public void requestChanningTest()
	{
		baseURI="https://reqres.in";
		
		Response resp = when().get("/api/users");
		
		int id=resp.jsonPath().get("data[1].id");
		System.out.println(id);
		
		when().get("/api/users/"+id)
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
		
		
	}

}
