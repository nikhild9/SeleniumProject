Feature: Testing Google Homepage
Scenario: Testing Search Functionality of Google Homepage 
Given User Opens "https://www.google.com" url
When User enters "selenium" in the search box
And User selects first option
Then Result page should appear