Feature: Scenario Outline Example

	@outline
	Scenario Outline:
		When I login with "<username>" and "<password>"
		And Click on the login button
		Then Validate that "<username>" is displayed
		And Print Bye "<fullName>" on the screen
		
	Examples:
		| username | password | fullName |
		| alaric | pw111 | Alaric G. |
		| joost | pw222 | Joost W. |
		| jackeline | pw333 | Jackeline M. |		
			