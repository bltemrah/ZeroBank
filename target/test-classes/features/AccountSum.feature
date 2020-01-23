Feature: Account summary

  Background:
    Given the user is on the login page

    @wip
  Scenario: Account summary page
    When the user enter "username" "password"
    Then the user should be able to see "Zero - Account Summary"
