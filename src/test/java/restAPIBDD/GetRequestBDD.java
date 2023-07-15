package restAPIBDD;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestBDD {

	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//			Test1
//			RestAssured.given()
//			.baseUri("http://localhost:3000/employees")
//			.when()
//			.get("/3")
//			.then()
//			.log()
//			.everything()
//			.statusCode(200)
//			.body("name",Matchers.equalTo("Vidhya"));
		
		
		
		
//		Test2
//		RestAssured.given()
//		.baseUri("http://localhost:3000/employees")
//		.when()
//		.get()
//		.then()
//		.log()
//		.everything()
//		.statusCode(200)
//		.body("[3].name",Matchers.equalTo("John"));
		
		
		
//		Test3 - Mixture of BDD and classical test format
		Response response = RestAssured.given()
				.baseUri("http://localhost:3000/employees")
				.when()
				.get();
		
		Assert.assertEquals(response.statusCode(), 200);
		

	}

}
