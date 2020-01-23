Feature: Account summary

  Background:
    Given the user is on the login page

    @wip
  Scenario: Login as authorized users
    When the user enter "username" "password"
    Then the user should be able to see "Zero - Account Summary"
