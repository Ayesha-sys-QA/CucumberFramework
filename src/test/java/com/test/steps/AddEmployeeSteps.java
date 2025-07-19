package com.test.steps;

import com.test.pages.AddEmployeePageElements;
import com.test.pages.DashboardPageElements;
import com.test.pages.LoginPageElements;
import com.test.pages.PersonalDetailsPageElements;
import com.test.utils.CommonMethods;
import com.test.utils.ConfigsReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps extends CommonMethods {
	
	@When("The user clicks on the PIM menu")
	public void The_user_clicks_on_the_PIM_menu() {
		click(dashboardPage.PIM);
	}
		
	@And("The user navigates to the Add Employee page")
	public void the_user_navigates_to_the_add_employee_page() {
	    click(dashboardPage.addEmployeeLink);
	}

	@And("The user enters first name and last name")
	public void the_user_enters_first_name_and_last_name() {
		waitForVisibility(addEmployeePage.firstName);
	    sendText(addEmployeePage.firstName, "Aicha");
	    sendText(addEmployeePage.lastName, "Moustatia");
	}

	@When("Clicks the save button")
	public void clicks_the_save_button() {
	   click(addEmployeePage.saveBtn);
	}

	@Then("The employee is added successfully")
	public void the_employee_is_added_successfully() {
	  if (addEmployeePage.loginDetailsToggle.isDisplayed()) {
		  System.out.println("TEST successful. Employee added.");
		  	  
	} else {
		System.out.println("TEST failed. Employee is not added.");
	}
	}

	@When("The user deletes the auto-generated employee id")
	public void the_user_deletes_the_auto_generated_employee_id() {
		addEmployeePage.employeeId.clear();
	}

	
	@When("The user enters employee info and enables login creation")
	public void the_user_enters_employee_info_and_enables_login_creation() {
		waitForClickability(addEmployeePage.firstName);
	    sendText(addEmployeePage.firstName, "Aicha");
	    sendText(addEmployeePage.lastName, "Moustatia");
	   selectDropdown(addEmployeePage.location, "France Regional HQ");
	    click(addEmployeePage.loginDetailsToggle);
	}

	@When("Enters username and password")
	public void enters_username_and_password() {
	    waitForVisibility(addEmployeePage.username);
	    sendText(addEmployeePage.username, "AdminAMSarah");
		sendText(addEmployeePage.password, "Moustatia@123");
		sendText(addEmployeePage.confirmPassword, "Moustatia@123");
		
		
		wait(5);
	    click(addEmployeePage.saveBtn);
	}
	@Then("The employee is added with login credentials")
	public void the_employee_is_added_with_login_credentials() {
	  
	        waitForVisibility(personalDetailsPage.firstName);
	        String actualName = personalDetailsPage.firstName.getAttribute("value");
	        if ("Aicha".equals(actualName)) {
	            System.out.println("TEST successful. Employee added.");
	        } else {
	            System.out.println("TEST failed. Name mismatch.");
	        }
	   
	
	    }
	
}




