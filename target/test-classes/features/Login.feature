@login
Feature: Users should be able to login



  Scenario: Login with valid credentials
    Given the user navigates to login page
    When the user enter "username" "password"
    Then the user should be able to see "Zero - Account Summary"


  Scenario: Users should not be able to login with unvalid credentials
    Given the user navigates to login page
    When the user enter "user" "pass"
    Then the error message should be "Login and/or password are wrong."


  Scenario: Users should not be able to login without any credentials
    Given the user navigates to login page
    When the user does not enter any credentials
    Then the error message should be "Login and/or password are wrong."


