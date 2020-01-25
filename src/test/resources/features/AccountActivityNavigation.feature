Feature: Navigating to specific accounts in Accounts Activity

  Background:
    Given the user navigates to login page
    And the user enter "username" "password"


  Scenario: Saving account redirect

    When the user clicks on Saving link on the Cash Account under Account Summary page
    Then the page should be displayed "Zero - Account Activity"
    And Account drop down menu should shows "Savings"


  Scenario: Brokerage account redirect

    When the user clicks on Brokerage link on the Investment Account under Account Summary page
    Then the page should be displayed "Zero - Account Activity"
    And Account drop down should have "Brokerage" selected

  Scenario: Checking account redirect

    When the user clicks on Checking link on the Credit Account under Account Summary page
    Then the page should be displayed "Zero - Account Activity"
    And Credit Account should have "Checking" under show transaction account

  Scenario: Credit Card account redirect

    When the user clicks on Credit Card link on the Credit Account under Account Summary page
    Then the page should be displayed "Zero - Account Activity"
    And Credit Account should have "Credit Card" as default option

  @wip
  Scenario: Loan account redirect

    When the user clicks on Loan link on the Loan Account under Account Summary page
    Then the page should be displayed "Zero - Account Activity"
    And Loan Account should have "Loan" as default option