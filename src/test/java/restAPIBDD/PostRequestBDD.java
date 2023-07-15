package restAPIBDD;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostRequestBDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject jobj = new JSONObject();
		jobj.put("name", "Roshan");
		jobj.put("salary", 22000);
		
		RestAssured.given()
		.baseUri("http://localhost:3000/employees")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(jobj.toString())
		.when()
		.post("/create")
		.then()
		.statusCode(201)
		.log()
		.body();

	}

}
