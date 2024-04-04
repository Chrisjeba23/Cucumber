Feature: Check Registration page 

Background: 
	Given Open Registration page 
	
Scenario: Register a member into Registration page 
	When Enter the following table data 
		|Christopher|Jeba Singh|Coimbatore|chrisjeba@gmail.com|9675643526|
		|Samuel|D|Coimbatore|samuel@gmail.com|9675467526|
		|Don|Felix|Coimbatore|Don123@gmail.com|9675555826|
	Then Registration should happen 
	
	
	
Scenario: Register into the Registration page 
	When Enter the following datas of the table 
	    |Firstname|Last name|Address|Emailid|Contact number|
		|Christopher|Jeba Singh|Coimbatore|chrisjeba@gmail.com|9675643526|
		|Samuel|D|Coimbatore|samuel@gmail.com|9675467526|
		|Don|Felix|Coimbatore|Don123@gmail.com|9675555826|
	Then Registration must happen