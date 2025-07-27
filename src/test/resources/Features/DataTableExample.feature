Feature: Data Table Example

	@dataTable
	Scenario: Add employees using DataTable
		When I login to the HRM website
		And I want to add new employees
			| FirstName | LastName | Position |
			| Anna | Thurman | General Manager |
			| Faraaz | Mo | Marketing Analyst |
			| Jackeline | Middleton | Testing Engineer |
		Then I validate that the employee is added