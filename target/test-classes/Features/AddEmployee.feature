@homework1
Feature: Add Employee

  Scenario: Add Employee with first and last name
    Given The user is logged in with valid credentials
    When The user clicks on the PIM menu
    And The user navigates to the Add Employee page
    And The user enters first name and last name
    And Clicks the save button
    Then The employee is added successfully

  Scenario: Add Employee without employee id
    Given The user is logged in with valid credentials
    When The user clicks on the PIM menu
    And The user navigates to the Add Employee page
    And The user deletes the auto-generated employee id
    And Clicks the save button
    Then The employee is added successfully

  Scenario: Add Employee and create login credentials
  Given The user is logged in with valid credentials
  When The user clicks on the PIM menu
  And The user navigates to the Add Employee page
  And The user enters employee info and enables login creation
  And Enters username and password
  Then The employee is added with login credentials
  