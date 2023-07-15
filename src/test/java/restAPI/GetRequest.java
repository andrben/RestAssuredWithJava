package restAPI;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
	
	
	@Test
	public static void main(String[] args) {
		
		RestAssured.baseURI = "http://localhost:3000/employees";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get();
		
		String body = response.getBody().asString();
		
		System.out.println("Response body is " + body);
		
		System.out.println("Response code is " + response.statusCode());
		
		System.out.println("Response header are  " + response.getHeader("Content-Type"));
		
		Assert.assertEquals(response.statusCode(), 200);

		// Print all the names of employees on the console
		
		JsonPath json = response.jsonPath();
		ArrayList<String> names = new ArrayList<String>(); 
				names = json.get("name");
		
		for(String name:names) {
			
			System.out.println("The name is " + name);
		}

	}

}
