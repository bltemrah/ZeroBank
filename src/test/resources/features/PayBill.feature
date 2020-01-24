@PayBill
Feature: Pay bill

  Background:
    Given the user navigates to login page
    And the user enter "username" "password"


  Scenario: Account activity page title
    When the user click to "Pay Bill"
    Then the user should be able to see "Zero - Pay Bills" as title


  Scenario: Pay saved payee
    When the user click to "Pay Bill"
    And the user complete successfully a payment operation
    Then the user should be able to see "The payment was successfully submitted." as message


  Scenario: To make a payment without entering
    When the user click to "Pay Bill"
    And the user does not enter the amount or data
    Then the user should be able to see the message "Please fill out this field message!"


  Scenario: Ammount field should not accept alphabetical or special characters
    When the user click to "Pay Bill"
    And the user enter the amount with alphabetical characters
    Then the user should not be able to see the message "The payment was successfully submitted."
