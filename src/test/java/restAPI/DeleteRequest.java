package restAPI;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRequest {
public static void main(String[] args) {
		
		RestAssured.baseURI = "http://localhost:3000/employees";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.delete("/5");
		
		
		System.out.println("Response code is " + response.statusCode());
		
		
		
		Assert.assertEquals(response.statusCode(), 200);

}
}