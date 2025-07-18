Feature: Searching in Google

    Scenario: Searching for a term in Google
        Given I open the Google homepage
        When I type "Cucumber testing" into the search box
        And I press the search button
        Then I should see results related to "Cucumber testing"
        And I should see the number of results displayed
    
