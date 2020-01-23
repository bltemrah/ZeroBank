Feature: Account activity

  Background:
    Given the user navigates to login page


  Scenario: Account summary page
    When the user enter "username" "password"
    Then the user should be able to see "Zero - Account Summary"
