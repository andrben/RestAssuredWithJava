package springbootApp;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostNewEmployee {
	@Test
	public static void main(String[] args) {
		
		RestAssured.baseURI = "http://localhost:8088/employees";
		RequestSpecification request = RestAssured.given();
		
		Response response = request.contentType(ContentType.JSON)
									.accept(ContentType.JSON)
									.body("{\r\n"
											+ "    \"firstName\": \"Vindhya\",\r\n"
											+ "    \"lastName\": \"Naidu\",\r\n"
											+ "    \"salary\": \"9000\",\r\n"
											+ "    \"email\": \"vindhya.n@xyz.com\"\r\n"
											+ "}")
									.post();
		
		
		String body = response.getBody().asString();
		System.out.println("Response body is " + body);
		
		System.out.println("Response code is " + response.statusCode());
		
		
	}

}
