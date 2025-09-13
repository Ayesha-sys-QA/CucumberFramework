Feature: Dashboard Menu

	@menu
	Scenario: Validate the main menu items on the dashboard
		Given The user is logged in with valid credentials
		Then I want to validate the items in main menu
			|Admin|
			|PIM|
			|My Info|
			|Discipline|
			|Reports Catalog|
			|More|
			|Maintenance&|
	
	