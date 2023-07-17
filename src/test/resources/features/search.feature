Feature: Search Functionality

Scenario: User search for valid product
Given user open the application
When User enters valid product "HP" into searchbox field
And user click on search button 
Then user should get valid product displayed in search results 

Scenario: User search for invalid product
Given user open the application
When User enters valid product "HONDA" into searchbox field
And user click on search button 
Then user should get message about product matching

Scenario: User search without any product 
Given user open the application
When User dont enters product name into searchbox field
And user click on search button 
Then user should get message about no product matching