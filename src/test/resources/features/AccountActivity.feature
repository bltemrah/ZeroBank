Feature: Account activity

  Background:
    Given the user navigates to login page
    When the user enter "username" "password"

  @AcctActivity
  Scenario: Account summary page
    Then the user should be able to see "Zero - Account Summary"

  @AcctActivity
  Scenario: Account drop down default option
    And navigate to "Account Activity"
    Then the user shoould be able to see "Savings"

  @AcctActivity
  Scenario: Account drop down all options
    And navigate to "Account Activity"
    Then the user should be able to see the following drop down options
      | Savings | Checking | Loan | Credit Card | Brokerage |

  @AcctActivity
  Scenario: Transactions table column names
    And navigate to "Account Activity"
    And click to "Find Transactions"
    Then the user should be able to see the following column
      | Description | Dates | Amounts | Type |


  @AcctActivity @wip
  Scenario: Transaction type options
    And navigate to "Account Activity"
    And click to "Find Transactions"
    Then the user should be able to see the following transaction type
      | Any | Deposit | Withdrawal |


