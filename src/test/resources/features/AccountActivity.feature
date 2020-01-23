Feature: Account activity

  Background:
    Given the user navigates to login page
    When the user enter "username" "password"

  @AcctActivity
  Scenario: Account summary page
    Then the user should be able to see "Zero - Account Summary"

  @AcctActvOption
  Scenario: Account drop down default option
    And navigate to "Account Activity"
    Then the user shoould be able to see "Savings"




