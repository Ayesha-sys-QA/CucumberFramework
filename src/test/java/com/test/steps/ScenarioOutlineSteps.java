package com.test.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {

	@When("I login with {string} and {string}")
	public void i_login_with_and(String username, String password) {
		System.out.println("Logging in with " + username + " and " + password);
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
		System.out.println("Clicking the login button...");
	}

	@Then("Validate that {string} is displayed")
	public void validate_that_is_displayed(String username) {
		System.out.println("Validating the username " + username + " is displayed");
	}

	@Then("Print Bye {string} on the screen")
	public void print_bye_on_the_screen(String fullName) {
		System.out.println("Validate Bye " + fullName + " is displayed");
	}
}