Feature: Account summary page

  @AcctType
  Scenario: Account summary page
    Given the user navigates to login page
    And the user enter "username" "password"
    When the user have account summary page
    Then the user should be able to see following options
      | Cash Accounts | Investment Accounts | Credit Accounts | Loan Accounts |


  @wip
  Scenario: Credit account table
    Given the user navigates to login page
    And the user enter "username" "password"
    When the user have account summary page
    Then the user should be able to see following tables
      | Account | Credit Card | Balance |
