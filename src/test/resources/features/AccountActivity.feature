@AcctActivity
Feature: Account activity

  Background:
    Given the user navigates to login page
    When the user enter "username" "password"


  Scenario: Account summary page
    Then the user should be able to see "Zero - Account Summary"


  Scenario: Account drop down default option
    And the user navigate to "Account Activity"
    Then the user shoould be able to see "Savings"

  @check
  Scenario: Account drop down all options
    And the user navigate to "Account Activity"
    Then the user should be able to see the following drop down options
      | Savings | Checking | Loan | Credit Card | Brokerage |


  Scenario: Transactions table column names
    And the user navigate to "Account Activity"
    And click to "Find Transactions"
    Then the user should be able to see the following column
      | Description | Dates | Amounts | Type |


  Scenario: Transaction type options
    And the user navigate to "Account Activity"
    And click to "Find Transactions"
    Then the user should be able to see the following transaction type
      | Any | Deposit | Withdrawal |



