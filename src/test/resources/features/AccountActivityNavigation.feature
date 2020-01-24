Feature: Navigating to specific accounts in Accounts Activity

  Background:
    Given the user navigates to login page
    And the user enter "username" "password"

  @wip
  Scenario: Saving account redirect

    When the user clicks on Saving link on the Cash Account under Account Summary page
    Then the page should be displayed "Zero - Account Activity"
    And Account drop down menu should shows "Savings"

  @wip
    Scenario: Brokerage account redirect

    When the user clicks on Brokerage link on the Investment Account under Account Summary page
