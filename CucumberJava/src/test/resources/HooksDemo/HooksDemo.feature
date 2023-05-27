Feature: Check Login Functionality

  @smoke
  Scenario: 
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then User is navigated to home page

  @regression
  Scenario: 
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then User is navigated to home page
