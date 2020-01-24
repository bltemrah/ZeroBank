@PayBill
Feature: Pay bill

  Background:
    Given the user navigates to login page
    And the user enter "username" "password"


  Scenario: Account activity page title
    When the user click to "Pay Bill"
    Then the user should be able to see "Zero - Pay Bills" as title

  @wip
  Scenario: Pay saved payee
    When the user click to "Pay Bill"
    And