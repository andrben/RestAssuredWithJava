package gitHub;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class createRepo {
	public static void main(String[] args) throws IOException {

	byte[] dataFile = Files.readAllBytes(Paths.get("repodata.json"));

	RestAssured.baseURI = "https://api.github.com/user/repos";
	RequestSpecification request = RestAssured.given();

	Response response = request.auth().oauth2("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").contentType(ContentType.JSON).accept(ContentType.JSON).body(dataFile).post();

	String body = response.getBody().asString();
	System.out.println("Response body is " + body);

	System.out.println("Response code is " + response.statusCode());
	}
	
}
