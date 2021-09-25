Feature: Register as new user to nop commerce application
  In to register on nop commerce application
  As a new user
  I should provide name ,last name  valid email and password and necessary personal data
  Scenario: Register as a new user
    Given I navigate to url "https://demo.nopcommerce.com/"
    Then  I should be navigate to nop site
    When  I click on register link
    Then  I should be navigate to register page
    And   I select my gender as Female
    And   I enter my First name last name email password and confirm password
    |First name |Last name |      email         |password  |confirm password |
    |   Neha    |  Khan    |nehakhan8@gmail.com |test@123  |test@123         |
    And   I click on register button
    Then  I should be register sucessfully as a new use]