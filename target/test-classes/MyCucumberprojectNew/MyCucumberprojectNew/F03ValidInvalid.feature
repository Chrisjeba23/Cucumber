Feature: Orange HRM Login 

Background:
Given Open Orange HRM application

Scenario: Login into Orange HRM with valid credentials
	
	When Provide Valid username and valid passwor
	And  click on the loginn buttonn 
	Then Login should happen successfully
	
Scenario: Login into Orange HRM with Invalid credentials

	When Provide Invalid username and Invalid password 
	And Press over the login buttonn 
	Then Login should not happen and Error message should display
