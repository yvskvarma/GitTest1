package sample;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTest2 {
	
	String authtoken = null;
	
  @BeforeMethod
  public void f() throws ParseException {
	  
	  	RestAssured.baseURI = "https://api.bridgethings.com/metaservice/v1/login";
	  
	  	RequestSpecification  httpRequest = RestAssured.given();
		
		JSONObject requestParameters = new JSONObject();
		
		requestParameters.put("email", "bipl.user@mailinator.com");
		
		requestParameters.put("password", "12345678");
		
		
		httpRequest.header("content-type", "application/json");
		
		httpRequest.body(requestParameters.toJSONString());
		
		Response response = httpRequest.request(Method.POST, "");
		
		String JsonData = response.getBody().asString();
		
		System.out.println(JsonData);
		
		JSONParser parser = new JSONParser(); 
		
		JSONObject json = (JSONObject) parser.parse(JsonData);

		
		String firstName = json.get("firstName").toString();
		
		String email = json.get("email").toString();
		
		String token = json.get("token").toString();
		
		String message = json.get("message").toString();
		
		System.out.println(firstName);
		System.out.println(email);
		System.out.println(token);
		System.out.println(message);
		 
		
		authtoken = token;
		
		
  	}
  
  @Test(enabled =  true, priority =  2)
  public void RES2() {
	  
	  RestAssured.baseURI = "https://api.bridgethings.com/metaservice/v1";
	  
	  RequestSpecification httrequest = RestAssured.given();
	  
	  
	  httrequest.header("content-type", "application/json");
	  
	  httrequest.header("authtoken", authtoken);
	  
	  Response response = httrequest.request(Method.GET, "/user_info");
	  
	  System.out.println(response.getBody().asString());

	  
  }
}
