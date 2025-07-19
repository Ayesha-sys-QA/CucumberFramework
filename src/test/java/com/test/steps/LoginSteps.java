package com.test.steps;

import com.test.pages.DashboardPageElements;

import com.test.pages.LoginPageElements;
import com.test.utils.CommonMethods;
import com.test.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {
	@Given("The user is logged in with valid credentials")
	public void the_user_is_logged_in_with_valid_credentials() {
	    sendText(loginPage.username, ConfigsReader.getProperty("username"));
	    sendText(loginPage.password, ConfigsReader.getProperty("password"));
	    click(loginPage.loginBtn);
	}

	@Then("I should be redirected to the dashboard")
	public void i_should_be_redirected_to_the_dashboard() {
		String expected = "Jacqueline White";
		String actual = dashboardPage.accountName.getText();

		if (actual.equals(expected)) {
			System.out.println("TEST successful. User is on the dashboard.");
		} else {
			System.out.println("TEST failed. User is not on the dashboard.");
		}
	}

	@Then("I quit the browser")
	public void i_quit_the_browser() {
		tearDown();
	}

	@When("I enter invalid password")
	public void i_enter_invalid_password() {
		sendText(loginPage.password, "invalidPassword");
	}

	@Then("I should see Invalid Credentials message")
	public void i_should_see_invalid_credentials_message() {
		String expectedMessage = "Invalid Credentials";
		String actualMessage = loginPage.invalidPassword.getText();

		if (actualMessage.equals(expectedMessage)) {
			System.out.println("TEST successful. Invalid credentials message is displayed.");
		} else {
			System.out.println("TEST failed. Invalid credentials message is not displayed.");
		}
	}

}