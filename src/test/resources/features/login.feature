
Feature: Login functanility
 

  @tag1
  Scenario: login with valid credentials
    Given user has navigated to login page
    When user enter valid email address "patilmangeshr12@gmail.com" into email field
    And user enter valid password "Mango@123" into password field
    And user click on login button
    Then user should get sucessfully login
    
    
  @tag2
  Scenario: login with invalid credentials
    Given user has navigated to login page
    When user enter invalid email address "ma2ngeshrp243@gmil.com" into email field
    And user enter invalid password "Mang5o@123" into password field
    And user click on login button
    Then user should get proper error message about credentials mismatch

  
   Scenario: login with valid email and invalid password
    Given user has navigated to login page
    When user enter invalid email address "mangeshrp143@gmil.com" into email field
    And user enter invalid password "Mang5o@123" into password field
    And user click on login button
    Then user should get proper error message about credentials mismatch
    
    Scenario: login with invalid valid email and valid password
    Given user has navigated to login page
    When user enter invalid email address "mangeshrp243@gmil.com" into email field
    And user enter invalid password "Mango@123" into password field
    And user click on login button
    Then user should get proper error message about credentials mismatch
    
    Scenario: login with valid email and invalid password
    Given user has navigated to login page
    When user enter invalid email address "mangeshrp243@gmil.com" into email field
    And user enter invalid password "Mang5o@123" into password field
    And user click on login button
    Then user should get proper error message about credentials mismatch
    
    Scenario: login without providing any credentials
    Given user has navigated to login page into email field
    And user enter invalid password into password field
    And user click on login button
    Then user should get proper error message about credentials mismatch