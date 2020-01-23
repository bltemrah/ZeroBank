Feature: Users should be able to login


  @login
  Scenario: Login as a authorized users
    Given the user is on the login page
    When the user enter "username" "password"
    Then the user should be able to see "Zero - Account Summary"
  @login
  Scenario: Login as a authorized users
    Given the user is on the login page
    When the user enter "user" "pass"
    Then the error message should be "Login and/or password are wrong."

