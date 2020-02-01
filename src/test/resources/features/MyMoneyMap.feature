Feature: OutFlow chart

  @wip
  Scenario: The user should be able to see retail on the chart
    Given the user navigates to login page
    And the user enters the valid credential for login
    When the user click to My Money Map tab
    Then the user should be able to see "Retail" on the chart
