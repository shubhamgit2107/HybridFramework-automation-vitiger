package practice;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class DeleteOperationUsingBdd {
	@Test
	public void deleteOperationTest()
	{
	
		
		given()
		.when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.assertThat().statusCode(204)
		.log().all();
	}

}
