Feature: Login Functionality

	Scenario: Valid login to HRM
	    Given I open the HRM application
        When I enter valid username
        And I enter valid password
        And I click on the login button
        Then I should be redirected to the dashboard
        And I quit the browser
        
      Scenario: Invalid login to HRM
          Given I open the HRM application
          When I enter valid username
          And I enter invalid password
          And I click on the login button
          Then I should see Invalid Credentials message
          And I quit the browser	
          
      Scenario: Login with empty password
 		Given I open the HRM application
  		And I enter valid username
  		And I leave the password field empty
 		And I click on the login button
 		Then I should see Required message
 		And I quit the browser