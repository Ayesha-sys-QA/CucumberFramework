package com.test.steps;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {

    @Given("I open the Google homepage")
    public void i_open_the_google_homepage() {
        System.out.println("STEP: open Google homepage");
    }

    @When("I type {string} into the search box")
    public void i_type_into_the_search_box(String searchText) {
        System.out.println("STEP: type " + searchText);
    }

    @When("I press the search button")
    public void i_press_the_search_button() {
        System.out.println("STEP: press search button");
    }

    @Then("I should see results related to {string}")
    public void i_should_see_results_related_to(String expected) {
        System.out.println("STEP: see results related to " + expected);
    }

    @Then("I should see the number of results displayed")
    public void i_should_see_the_number_of_results_displayed() {
        System.out.println("STEP: results number is displayed");
    }
}






