Feature: Datadriven for Login functionality 

Scenario Outline:
Validate Login functionality with multiple data set using Datadriven 
	Given Launch into the Test Automation login webpage 
	When Provide the "<UserName>" and "<Password>" click on Login button
	Then New Login should happen 
	
	Examples: 
	
		|UserName|Password|
		|John|John123|
		|Gabriel|Gabi123|
		|student|Password123|
		|Maxwell|maxi123|