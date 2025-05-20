Feature: Login functionality

  Background:
    Given User is on the login page

  # ✅ Positive Scenario
  Scenario: Successful login with valid username and password
    When User enters login username "prince"
    And User enters login password "prince"
    And User clicks on the login button
    Then User should be logged in successfully

  # ❌ Negative Scenarios
  Scenario: Login with empty username
    When User leaves the login username field empty ""
    And User enters login password "Valid@123"
    And User clicks on the login button
    Then An error message "Username is required" should be displayed

  Scenario: Login with empty password
    When User enters login username "validUser"
    And User leaves the login password field empty ""
    And User clicks on the login button
    Then An error message "Password is required" should be displayed

  Scenario: Login with both fields empty
    When User leaves the login username field empty ""
    And User leaves the login password field empty ""
    And User clicks on the login button
    Then An error message "All fields are required" should be displayed

  Scenario: Login with invalid username
    When User enters login username "invalidUser"
    And User enters login password "Valid@123"
    And User clicks on the login button
    Then An error message "Invalid username or password" should be displayed

  Scenario: Login with invalid password
    When User enters login username "validUser"
    And User enters login password "wrongpass"
    And User clicks on the login button
    Then An error message "Invalid username or password" should be displayed

  Scenario: Login with case-sensitive username
    When User enters login username "VALIDUSER"
    And User enters login password "Valid@123"
    And User clicks on the login button
    Then An error message "Invalid username or password" should be displayed

  # 🔍 UI and Functional Scenarios
  #Scenario: Login button should be disabled when fields are empty
    #Then The login button should be disabled by default
#
  #Scenario: Login button should be enabled when fields are filled
    #When User enters login username "validUser"
    #And User enters login password "Valid@123"
    #Then The login button should be enabled
#
  #Scenario: Password field should be of type password
    #Then The password field should hide characters
