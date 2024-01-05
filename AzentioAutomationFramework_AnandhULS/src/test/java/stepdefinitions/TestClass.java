package stepdefinitions;

import io.cucumber.java.en.Given;

public class TestClass {
	@Given("navigate to URL feature one")
	public void navigate_to_url_feature_one() {

	}

	@Given("navigate to URL feature two")
	public void navigate_to_url_feature_two() throws Exception {
		throw new Exception("Exception occured");
	}
}
