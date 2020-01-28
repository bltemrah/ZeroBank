Feature: Purchase Foreign Currency

  Background:
    Given the user navigates to login page
    And the user enter "username" "password"


  Scenario: Available currency
    Given Go to Pay Bills module
    And click Purchase Foreign Currency
    Then Following currencies should be available
      | Canada (dollar)       |
      | Switzerland (franc)   |
      | China (yuan)          |
      | Denmark (krone)       |
      | Eurozone (euro)       |
      | Great Britain (pound) |
      | Japan (yen)           |
      | Mexico (peso)         |
      | Norway (krone)        |
      | New Zealand (dollar)  |
      | Singapore (dollar)    |



  Scenario: Error message for not selecting currency
    Given Go to Pay Bills module
    And click Purchase Foreign Currency
    When user tries to calculate cost without selection a currency
    Then the error message "Please, ensure that you have filled all the required fields with valid values." should be seen


  Scenario: Error message for not entering value
    Given Go to Pay Bills module
    Given click Purchase Foreign Currency
    When user tries to calculate cost without entering value
    Then the error message "Please, ensure that you have filled all the required fields with valid values." should be seen





