package reqres.CRUDoperation;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllUser {

	public static void main(String[] args) {
		Response resp = RestAssured.get("https://reqres.in/api/users");
		ValidatableResponse val = resp.then();
		val.log().all();

	}

}
