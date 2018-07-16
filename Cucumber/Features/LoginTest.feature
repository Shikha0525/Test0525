Feature: Login Action

Scenario: Successful Login with Valid Credentials
	Given  User is on Home Page
	When   User Navigate to LogIn Page
	And    User enters UserName and Password
	Then   Message displayed Login Successfully

Scenario: Unsuccessful Error Message
	When    User enter invalid username and password
	Then    Message displayed Invalid Username and password

