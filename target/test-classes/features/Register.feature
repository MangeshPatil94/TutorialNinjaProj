
Feature: Regestriation functionality
 


  Scenario: user create account only with mandatory fields
    Given user has navigated to Register Account page
    When user enter the below fields
   |firstName    |Jagdish                 |
   |lastname     |Patil										|
   |email        |mangeshkrpatil@gmail.com|
   |telephone    |1234567890							|
   |password     |12345										|
   And user select Privacy policy
   And user click on continiue button
   Then user account should get creaed sucessfully

    Scenario: user create account only with all fields
    Given user has navigated to Register Account page
    When user enter the below fields
   |firstName    |Jagdish                 |
   |lastname     |Patil										|
   |email        |mangeshkrpatil@gmail.com|
   |telephone    |1234567890							|
   |password     |12345										|
   And user select yes for New Account
   And user select Privacy policy
   And user click on continiue button
   Then user account should get creaed sucessfully 
   
    Scenario: user create a duplicate account 
    Given user has navigated to Register Account page
    When user enter the below fields
   |firstName    |Jagdish                 |
   |lastname     |Patil										|
   |email        |mangeshkrpatil@gmail.com|
   |telephone    |1234567890							|
   |password     |12345										|
   And user select yes for New Account
   And user select Privacy policy
   And user click on continiue button
   Then user account should get proper warning about duplicate email
   
   Scenario: User ceates account without filling any details
   Given user has navigated to Register Account page
   When user dont enter any details into fields
   And user click on continiue button
   Then user should get proper warning message to every field
