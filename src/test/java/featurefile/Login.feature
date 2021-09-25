Feature: Login to nop commerce application

  Scenario: Verify login with valid credentials
    Given I navigate to url "https://demo.nopcommerce.com/"
    Then I should be navigate to home page
    When I click on login link from the navbar
    Then I should be navigate to login page
    When I enter email "khanshaira@gmail.com"
    And I enter password as "Test@123"
    And I click on login button
    Then I should be login successfully
    Then new step