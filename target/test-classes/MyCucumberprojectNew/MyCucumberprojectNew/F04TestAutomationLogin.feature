Feature: Test Automation Login functionality

Background: 

Given Launch test Automation Login page

Scenario: To check Test Automation Login functionality with valid credentials
When I provide valid username as "student"
And I provide valid Password as "Password123"
And I click on Login button
Then Login should happen and Home page should be landed

Scenario: To check test Automation Login with Invalid credentials
When provide invalid username as "Christo"
And provide invalid password as "Chris123"
And Click over the Login button
Then Login should not happen and error message should display



