Feature: Search Functionality in Amazon website
Scenario: Search a product in Amazon website
Given Launch Amazon website
When Provide "iPhone" mobiles with price below 50000
And Enter button press
Then The search results should be displayed