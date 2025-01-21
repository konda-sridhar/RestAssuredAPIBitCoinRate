package stepDefinitions;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CheckBitCoinRate {
	
	Response response;

@Given("the Coinbase API endpoint for GBP value is available")
public void the_coinbase_api_endpoint_for_gbp_value_is_available() {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println("\n --- Given Start -- ");
	RestAssured.baseURI = "https://api.coindesk.com/";
	RestAssured.basePath = "/v1/bpi/currentprice.json";
	System.out.println(" --- Given End-- \n");
	
}

@When("I make a Get request for the Bitcoin value in GBP")
public void i_make_a_get_request_for_the_bitcoin_value_in_gbp() {

	System.out.println("\n --- When Start -- ");
	response = given().when().get().then().contentType(ContentType.JSON).extract().response();
	System.out.println("--- When End --\n");
	
}

@Then("the response status code should be {int}")
public void the_response_status_code_should_be(Integer int1) {

	
	System.out.println("\n --- Then1 Start -- ");
	int statusCode = 0;
	
	statusCode = response.getStatusCode();
	System.out.println("StatusCode value is : " + statusCode);
	System.out.println(" --- Then1 End -- \n");
	
		
}
@Then("the Bitcoin value should be fetched successfully and printed")
public void the_bitcoin_value_should_be_fetched_successfully_and_printed() {

	System.out.println("\n --- Then2 Start -- ");
	String bitcoinRateGBP = response.jsonPath().getString("bpi.GBP.rate");
	System.out.println("Bitcoin rate in GBP: " + bitcoinRateGBP);
	System.out.println(" --- Then2 End -- \n");
	
	
}

}


