@Alltests
Feature: Read Title of the Google Links 

Background: 

	Given Open Google browser and launch google.com 
	
@Google	
Scenario: Read the title of Google Home page 
	When Launch the Google website Home page 
	And Read the title of Google Home page 
	And check the title whether Actual title is equal to Expected title 
	Then Display the result of the title 
	
@Gmail	
Scenario: Read the title of Gmail Home page 
	When Launch into the Google website 
	And Click on Gmail link 
	And check the Gmail page title whether Actual title matches Expected title only 
	Then Show the result of the title 

@Aboutus	
Scenario: Read the title of About page 
	When Move into the Google home  webpage 
	And Click on About link 
	And check the About page title the Actual title and Expected title 
	Then result of the title to be checked and displayed
	
	