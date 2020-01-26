Feature: Find transaction in account activity

  Background:
    Given the user navigates to login page
    And the user enter "username" "password"
    Given the user navigate to "Account Activity"
    When the user accesses to Find Transactions


  Scenario: Search data range

    And the user enters date from "2012-09-01" to "2012-09-06"
    When clicks Find button
    Then results table should only show transactions date from "2012-09-01" to "2012-09-06"
    And the results should be sorted by most recent date
    When the user enters date range from "2012-09-02" to "2012-09-06"
    And clicks Find button
    Then the user should only see the results between "2012-09-02" and "2012-09-06"
    And the results table should NOT contain transactions dated "2012-09-01"


  Scenario: Search description

    When the user enters description "ONLINE"
    And clicks Find
    Then result table should only show transfer containing "ONLINE" under Description column
    When the user enters "OFFICE" as a description
    And clicks Find
    Then results table should only display transfer containing "OFFICE"
    But results table should not display transfer containing "ONLINE"


  Scenario: Search description case insensitive
    When the user enters description "ONLINE"
    And clicks Find
    Then result table should only show transfer containing "ONLINE" under Description column
    When the user write "online" as a description
    And clicks Find
    Then result table should only show transfer containing "ONLINE"



  Scenario: Type
    And clicks Find
    Then results table should show at least 1 result under Deposit
    Then results table should show at least 1 result under Withdrawal
    When user selects type "Deposit"
    And clicks Find
    Then results table should show at least 1 result under Deposit
    Then results table should show no result under Withdrawal
    When user selects "Withdrawal"
    Then results table should show at least 1 result under Withdrawal
     But results tbale should show no result under Deposit







