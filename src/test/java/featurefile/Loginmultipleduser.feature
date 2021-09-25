Feature: register to nop commerce application
   In order to register on nop commerce application
   As a new user
   I should provide valid email and password and nessary personal data
  Scenario Outline: Register multiple as a new user
    Given I navigate to url "https://demo.nopcommerce.com/"
    Then  I should be navigate to nop site
    When  I click on register link
    Then  I should be navigate to register page
    And   I select my gender as Female
    And   I enter my First name
    And   I enter my Last name
    And   I enter my valid email address
    And   I enter my password
    And   I enter my Confirm Password
    When  I click on register tab
    Then  I should be successfully registered as a new user
    Examples:
      |   Username            |  Password |
      | shairakhan1@gmail.com |Test@123   |
      | shairakhan2@gmail.com |Test@123   |
      | shairakhan3@gmail.com |Test@123   |



