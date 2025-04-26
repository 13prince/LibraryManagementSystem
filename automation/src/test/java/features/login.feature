Feature: Login Functionality

  Scenario: Successful Login with valid credentials
    Given user is on the Login page
    When user enters valid email and password
    Then user should be redirected to homepage