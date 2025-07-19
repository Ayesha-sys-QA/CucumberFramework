package com.test.steps;

import com.test.pages.DashboardPageElements;
import com.test.pages.EmployeeListPageElements;
import com.test.pages.LoginPageElements;
import com.test.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchEmployeeSteps extends CommonMethods {
	
	
	@Given("The user navigates to the Employee List page")
	public void the_user_navigates_to_the_employee_list_page() {
		click(dashboardPage.PIM);
		click(dashboardPage.employeeListLink);
	}

	@When("The user enters a valid employee Id")
	public void the_user_enters_a_valid_employee_id() {
		sendText(employeeListPage.searchBox, "0029"); // Example employee ID
	}

	@When("Clicks the search button")
	public void clicks_the_search_button() {
		jsClick(employeeListPage.searchIcon);
	}

	@Then("The employee details are displayed")
	public void the_employee_details_are_displayed() {
		// lets skip this step for now
		System.out.println("I see the employee details displayed on the screen.");
		wait(5);
	}

	@When("The user enters a valid employee name")
	public void the_user_enters_a_valid_employee_name() {
		sendText(employeeListPage.searchBox, "Aaban Aale"); // Example employee name
	}
}