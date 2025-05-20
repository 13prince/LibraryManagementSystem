Feature: Signup

  Background:
    Given User is on the signup page

  # Positive Scenario
  Scenario: Successful signup with valid username, email, password, and role
    When User enters username "testuser"
    And User enters email "testuser@example.com"
    And User enters password "Test@1234"
    And User selects role "User"
    And User clicks on the register button
    Then User should be registered successfully

  # Negative Scenarios
  Scenario: Signup with empty username
    When User leaves the username field empty ""
    And User enters email "testuser@example.com"
    And User enters password "Test@1234"
    And User selects role "User"
    And User clicks on the register button
    Then An error message "Please Fill All Fields" should be displayed

  Scenario: Signup with empty email
    When User enters username "testuser"
    And User leaves the email field empty ""
    And User enters password "Test@1234"
    And User selects role "User"
    And User clicks on the register button
    Then An error message "Please Fill All Fields" should be displayed

  Scenario: Signup with empty password
    When User enters username "testuser"
    And User enters email "testuser@example.com"
    And User leaves the password field empty ""
    And User selects role "User"
    And User clicks on the register button
    Then An error message "Please Fill All Fields" should be displayed

  Scenario: Signup with unselected role
    When User enters username "testuser"
    And User enters email "testuser@example.com"
    And User enters password "Test@1234"
    And User selects role "Select Role"
    And User clicks on the register button
    Then An error message "Please Fill All Fields" should be displayed

  Scenario: Signup with invalid email format
    When User enters username "testuser"
    And User enters email "invalid-email"
    And User enters password "Test@1234"
    And User selects role "User"
    And User clicks on the register button
    Then An error message "Invalid Email Input" should be popup

  Scenario: Signup with weak password
    When User enters username "testuser"
    And User enters email "testuser@example.com"
    And User enters password "123"
    And User selects role "User"
    And User clicks on the register button
    Then An error message "Password is too weak" should be displayed

  Scenario: Signup with already registered email
    When User enters username "newuser"
    And User enters email "existinguser@example.com"
    And User enters password "New@1234"
    And User selects role "Admin"
    And User clicks on the register button
    Then An error message "Email already exists" should be displayed

  Scenario: Signup with all fields empty
    When User leaves the username field empty
    And User leaves the email field empty
    And User leaves the password field empty
    And User selects role "Select Role"
    And User clicks on the register button
    Then An error message "All fields are required" should be displayed

  # UI and Functional Scenarios
  #Scenario: Role dropdown contains all expected options
    #Then The role dropdown should contain the following options:
      #| Select Role |
      #| User        |
      #| Admin       |
#
  #Scenario: Register button is disabled until all fields are filled
    #Then The register button should be disabled by default
    #When User enters username "testuser"
    #And User enters email "test@example.com"
    #And User enters password "Test@1234"
    #And User selects role "User"
    #Then The register button should be enabled
