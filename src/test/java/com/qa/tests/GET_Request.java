package com.qa.tests;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import groovy.util.logging.Log;

public class GET_Request {
	
	
	
	@Test
	public void getWeatherDetails() {
		
		given()
		.when()
		    .get("https://demoqa.com/utilities/weather/city/Hyderabad")
		.then()
		    .statusCode(200)
		    .statusLine("HTTP/1.1 200 OK")
		    .assertThat().body("City", equalTo("Hyderabad"))
		    .header("Content-Type", "application/json; charset=utf-8")
		    .log().all();
		    
	}

}
