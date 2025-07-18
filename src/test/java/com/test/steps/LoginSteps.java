package com.test.steps;
import com.neotech.utils.CommonMethods;

import com.neotech.utils.ConfigsReader;
import com.test.pages.DashboardPageElements;
import com.test.pages.LoginPageElements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps extends CommonMethods {

	LoginPageElements login;
	DashboardPageElements dashboard;

	@Given("I open the HRM application")
	public void i_open_the_hrm_application() {
		setUp();

		login = new LoginPageElements();
		dashboard = new DashboardPageElements();
	}

	@When("I enter valid username")
	public void i_enter_valid_username() {
		sendText(login.username, ConfigsReader.getProperty("username"));
	}

	@When("I enter valid password")
	public void i_enter_valid_password() {
		sendText(login.password, ConfigsReader.getProperty("password"));
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		click(login.loginBtn);
	}

	@Then("I should be redirected to the dashboard")
	public void i_should_be_redirected_to_the_dashboard() {
		String expected = "Jacqueline White";
		String actual = dashboard.accountName.getText();

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
	    sendText(login.password, "Password123");
	}

	@Then("I should see Invalid Credentials message")
	public void i_should_see_invalid_credentials_message() {
	    String expected = "Invalid Credentials";
	    String actual = login.toastMessage.getText();
	  wait(2);
	   waitForVisibility(login.toastMessage);

	    if (actual.equals(expected)) {
	        System.out.println("TEST PASSED: Error message is displayed.");
	    } else {
	        System.out.println("TEST FAILED: No proper error message.");
	    }
	}
	
	@When("I leave the password field empty")
	public void i_leave_the_password_field_empty() {
	    login.password.sendKeys("");
	}
	
	@Then("I should see Required message")
	public void i_should_see_required_message() {
		
	    waitForVisibility(login.passwordEmptyError); 
	    
	    String actual = login.passwordEmptyError.getText();
	    String expected = ("Password cannot be empty");
	    if (actual.equals(expected)) {
	        System.out.println("TEST PASSED: Required message is displayed.");
	    } else {
	        System.out.println("TEST FAILED: Required message not found.");
}
	}
}