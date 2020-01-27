Feature: Purchase Foreign Currency

  Background:
    Given the user navigates to login page
    And the user enter "username" "password"

  @wip
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


