Feature: Test Login Functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigate to home page

    Examples: 
      | username | password |
      | Umar     |    12345 |
      | Ali      |    12345 |
      | pasha    |    12345 |
