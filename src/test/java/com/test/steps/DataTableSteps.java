package com.test.steps;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableSteps {

	@When("I login to the HRM website")
	public void i_login_to_the_hrm_website() {
		System.out.println("I login here...");
	}

	@When("I want to add new employees")
	public void i_want_to_add_new_employees(DataTable employees) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//

		List<Map<String, String>> employeeList = employees.asMaps();
		for (Map<String, String> employee : employeeList) {
			System.out.println(employee);
			System.out.println("First name: " + employee.get("FirstName"));
			System.out.println("Last name: " + employee.get("LastName"));
			System.out.println("Position" + employee.get("Position"));
		}
	}

	@Then("I validate that the employee is added")
	public void i_validate_that_the_employee_is_added() {
		System.out.println("Validate the employee is added");
	}
}