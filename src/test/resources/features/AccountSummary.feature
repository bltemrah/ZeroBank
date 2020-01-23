Feature: Account summary

  @wip
  Scenario: Account summary page
    Given the user navigates to login page
    And the user enter "username" "password"
    When the user have account summary page
    Then the user should be able to see following options
      | Cash Accounts | Investment Accounts | Credit Accounts | Loan Accounts |



